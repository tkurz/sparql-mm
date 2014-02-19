package de.tkurz.sparqlmm;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.media.fragments.temporal.NPTFragment;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.temporal.function.BoundingBoxFunction;
import com.github.tkurz.sparqlmm.temporal.function.IntermediateFunction;
import com.github.tkurz.sparqlmm.temporal.function.IntersectionFunction;
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
public class TemporalFunctionTest {

    private final String TEST1 = "/test1.ttl";
    private final String BASE_URI = "http://test.org/resource/";

    private RepositoryConnection connection;

    @BeforeClass
    public static void beforeClass() {
        FunctionRegistry.getInstance().add(new BoundingBoxFunction());
        FunctionRegistry.getInstance().add(new IntermediateFunction());
        FunctionRegistry.getInstance().add(new IntersectionFunction());
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
    public void testBoundingBox() throws RepositoryException, RDFParseException, IOException, MalformedQueryException, QueryEvaluationException, MediaFragmentURISyntaxException {
        importFile(TEST1);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                "PREFIX mmt: <" + Constants.NAMESPACE_TEMPORAL + ">" +
                "SELECT ?f1 ?f2 (mmt:boundingBox(?f1,?f2) AS ?box) WHERE {" +
                "   ?f1 rdfs:label \"1_1\"." +
                "   ?f2 rdfs:label \"1_3\"." +
                "}";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 1);

        for(BindingSet set : list) {
            String box = set.getBinding("box").getValue().stringValue();

            NPTFragment fragment = (NPTFragment)(new MediaFragmentURI(box)).getMediaFragment().getTemporalFragment();

            Assert.assertEquals(1.0, fragment.getStart().getValue(), 0);
            Assert.assertEquals(25.0,fragment.getEnd().getValue(),0);
        }
    }

    @Test
    public void testIntermediate() throws RepositoryException, RDFParseException, IOException, MalformedQueryException, QueryEvaluationException, MediaFragmentURISyntaxException {
        importFile(TEST1);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mmt: <" + Constants.NAMESPACE_TEMPORAL + ">" +
                        "SELECT ?f1 ?f2 (mmt:intermediate(?f1,?f2) AS ?box) WHERE {" +
                        "   ?f1 rdfs:label \"1_1\"." +
                        "   ?f2 rdfs:label \"1_3\"." +
                        "}";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 1);

        for(BindingSet set : list) {
            String box = set.getBinding("box").getValue().stringValue();

            NPTFragment fragment = (NPTFragment)(new MediaFragmentURI(box)).getMediaFragment().getTemporalFragment();

            Assert.assertEquals(5.0,fragment.getStart().getValue(),0);
            Assert.assertEquals(15.0,fragment.getEnd().getValue(),0);
        }
    }

    @Test
    public void testIntersection() throws RepositoryException, RDFParseException, IOException, MalformedQueryException, QueryEvaluationException, MediaFragmentURISyntaxException {
        importFile(TEST1);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mmt: <" + Constants.NAMESPACE_TEMPORAL + ">" +
                        "SELECT ?f1 ?f2 (mmt:intersection(?f1,?f2) AS ?box) WHERE {" +
                        "   ?f1 rdfs:label \"1_4\"." +
                        "   ?f2 rdfs:label \"1_3\"." +
                        "}";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 1);

        for(BindingSet set : list) {
            String box = set.getBinding("box").getValue().stringValue();

            NPTFragment fragment = (NPTFragment)(new MediaFragmentURI(box)).getMediaFragment().getTemporalFragment();

            Assert.assertEquals(20.0,fragment.getStart().getValue(),0);
            Assert.assertEquals(25.0,fragment.getEnd().getValue(),0);
        }
    }

}
