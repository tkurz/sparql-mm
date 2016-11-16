package com.github.tkurz.sparqlmm;

import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.sparqlmm.function.spatial.accessor.SpatialFragmentTest;
import com.github.tkurz.sparqlmm.function.general.aggregation.BoundingBoxFunction;
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
public class StringFragmentTest {

    private final String TEST9 = "/test9.ttl";
    private final String BASE_URI = "http://test.org/resource/";

    private RepositoryConnection connection;

    @BeforeClass
    public static void beforeClass() {
        FunctionRegistry.getInstance().add(new BoundingBoxFunction());
        FunctionRegistry.getInstance().add(new SpatialFragmentTest());
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
    public void testBoundingBoxFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST9);

        String query =
                "PREFIX oa: <http://www.w3.org/ns/oa#>" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?v1 ?v2 (mm:boundingBox(?v1,?v2) AS ?box) WHERE {" +
                        "   ?s1 oa:hasSource ?s;" +
                        "       rdf:value ?v1;" +
                        "       rdfs:label \"1_1\"." +
                        "   ?s2 oa:hasSource ?s;" +
                        "       rdf:value ?v2." +
                        "   FILTER (?s1 != ?s2)" +
                        "   FILTER mm:hasSpatialFragment(?v1)" +
                        "   FILTER mm:hasSpatialFragment(?v2)" +
                        "}";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 1);
        Assert.assertEquals("xywh=0,0,4,2",list.get(0).getBinding("box").getValue().stringValue());
    }
}
