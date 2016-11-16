package com.github.tkurz.sparqlmm;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.media.fragments.spatial.SpatialFragment;
import com.github.tkurz.media.fragments.temporal.NPTFragment;
import com.github.tkurz.sparqlmm.function.general.aggregation.BoundingBoxFunction;
import com.github.tkurz.sparqlmm.function.general.aggregation.IntersectionFunction;
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

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
public class CombinedFunctionTests {

    private final String TEST6 = "/test6.ttl";
    private final String TEST7 = "/test7.ttl";
    private final String BASE_URI = "http://test.org/resource/";

    private RepositoryConnection connection;

    @BeforeClass
    public static void beforeClass() {
        FunctionRegistry.getInstance().add(new BoundingBoxFunction());
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
    public void testIntersectionFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST6);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT (mm:intersection(?l1,?l2) AS ?box) WHERE {" +
                        "   <http://test.org/resource/fragment1> ma:locator ?l1." +
                        "   <http://test.org/resource/fragment2> ma:locator ?l2." +
                        "}";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        Assert.assertTrue(r.hasNext());

        BindingSet set = r.next();

        Assert.assertFalse(r.hasNext());

        String box = set.getBinding("box").getValue().stringValue();

        MediaFragmentURI uri = new MediaFragmentURI(box);

        SpatialFragment sfragment = uri.getMediaFragment().getSpatialFragment();

        Assert.assertEquals(25.0,sfragment.getX(),0);
        Assert.assertEquals(25.0,sfragment.getY(),0);
        Assert.assertEquals(25.0,sfragment.getWidth(),0);
        Assert.assertEquals(25.0,sfragment.getHeight(),0);

        NPTFragment tfragment = (NPTFragment) uri.getMediaFragment().getTemporalFragment();

        Assert.assertEquals(5.0,tfragment.getStart().getValue(),0);
        Assert.assertEquals(10.0,tfragment.getEnd().getValue(),0);

    }

    @Test
    public void testBoundingBoxFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST6);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT (mm:boundingBox(?l1,?l2) AS ?box) WHERE {" +
                        "   <http://test.org/resource/fragment1> ma:locator ?l1." +
                        "   <http://test.org/resource/fragment2> ma:locator ?l2." +
                        "}";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        Assert.assertTrue(r.hasNext());

        BindingSet set = r.next();

        Assert.assertFalse(r.hasNext());

        String box = set.getBinding("box").getValue().stringValue();

        MediaFragmentURI uri = new MediaFragmentURI(box);

        SpatialFragment sfragment = uri.getMediaFragment().getSpatialFragment();

        Assert.assertEquals(0.0,sfragment.getX(),0);
        Assert.assertEquals(0.0,sfragment.getY(),0);
        Assert.assertEquals(75.0,sfragment.getWidth(),0);
        Assert.assertEquals(75.0,sfragment.getHeight(),0);

        NPTFragment tfragment = (NPTFragment) uri.getMediaFragment().getTemporalFragment();

        Assert.assertEquals(0.0,tfragment.getStart().getValue(),0);
        Assert.assertEquals(15.0,tfragment.getEnd().getValue(),0);

    }

    @Test
    public void testBoundingBoxFunctionRB() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST7);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT (mm:boundingBox(?l1,?l2) AS ?box) WHERE {" +
                        "   <http://test.org/resource/fragment1> ma:locator ?l1." +
                        "   <http://test.org/resource/fragment2> ma:locator ?l2." +
                        "}";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        Assert.assertTrue(r.hasNext());

        BindingSet set = r.next();

        Assert.assertFalse(r.hasNext());

        String box = set.getBinding("box").getValue().stringValue();

        MediaFragmentURI uri = new MediaFragmentURI(box);

        SpatialFragment sfragment = uri.getMediaFragment().getSpatialFragment();

        Assert.assertEquals(26.0,sfragment.getX(),0);
        Assert.assertEquals(0.0,sfragment.getY(),0);
        Assert.assertEquals(74.0,sfragment.getWidth(),0);
        Assert.assertEquals(100.0,sfragment.getHeight(),0);

        NPTFragment tfragment = (NPTFragment) uri.getMediaFragment().getTemporalFragment();

        Assert.assertEquals(193,tfragment.getStart().getValue(),0);
        Assert.assertEquals(198,tfragment.getEnd().getValue(),0);

    }
}
