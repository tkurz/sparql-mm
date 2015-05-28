package com.github.tkurz.sparqlmm;

import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.sparqlmm.function.accessor.SpatialFragmentTest;
import com.github.tkurz.sparqlmm.function.accessor.DurationAccessor;
import org.junit.*;
import org.openrdf.query.*;
import org.openrdf.query.algebra.evaluation.function.FunctionRegistry;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.sail.SailRepository;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFParseException;
import org.openrdf.sail.memory.MemoryStore;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
public class AccessorTests {

    private final String TEST8 = "/test8.ttl";
    private final String BASE_URI = "http://test.org/resource/";

    private RepositoryConnection connection;

    @BeforeClass
    public static void beforeClass() {
        FunctionRegistry.getInstance().add(new SpatialFragmentTest());
        FunctionRegistry.getInstance().add(new DurationAccessor());
    }

    private void importFile(String filename) throws RepositoryException, RDFParseException, IOException {
        //import file
        InputStream in = this.getClass().getResourceAsStream(filename);
        connection.add(in,BASE_URI, RDFFormat.TURTLE);
    }


    @Before
    public void before() throws IOException, RepositoryException, RDFParseException {
        Repository repo = new SailRepository(new MemoryStore());
        repo.initialize();
        connection = repo.getConnection();
    }

    @After
    public void after() throws RepositoryException {
        if(connection!=null) connection.close();
    }

    @Test
    public void testIsSpatialFragmentFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST8);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?l WHERE {" +
                        "   ?f a ma:MediaFragment; rdfs:label ?l. " +
                        "   FILTER mm:isSpatialFragment(?f)" +
                        "} ORDER BY ?l";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 2);
        Assert.assertEquals("1_1",list.get(0).getBinding("l").getValue().stringValue());
        Assert.assertEquals("1_3",list.get(1).getBinding("l").getValue().stringValue());
    }

    @Test
    public void testGetDuration() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST8);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?duration WHERE {" +
                        "   ?f a ma:MediaFragment." +
                        "   BIND (mm:getDuration(?f) AS ?duration)" +
                        "} ORDER BY DESC(?duration)";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 3);
        Assert.assertEquals("3.0",list.get(0).getBinding("duration").getValue().stringValue());
        Assert.assertEquals("1.0",list.get(1).getBinding("duration").getValue().stringValue());
        Assert.assertNull(list.get(2).getBinding("duration"));
    }
}
