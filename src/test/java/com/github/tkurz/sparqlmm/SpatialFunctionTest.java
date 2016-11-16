package com.github.tkurz.sparqlmm;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.media.fragments.spatial.SpatialFragment;
import com.github.tkurz.sparqlmm.function.spatial.aggregation.BoundingBoxFunction;
import com.github.tkurz.sparqlmm.function.spatial.aggregation.IntersectionFunction;
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
public class SpatialFunctionTest {

    private final String TEST3 = "/test3.ttl";
    private final String TEST3a = "/test3a.ttl";
    private final String TEST6 = "/test6.ttl";
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
    public void testBoundingBoxFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST3);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?f1 ?f2 (mm:spatialBoundingBox(?f1,?f2) AS ?box) WHERE {" +
                        "   ?f1 rdfs:label \"1_1\"." +
                        "   ?f2 rdfs:label \"1_2\"." +
                        "}";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 1);

        String box = list.get(0).getBinding("box").getValue().stringValue();

        SpatialFragment fragment = (new MediaFragmentURI(box)).getMediaFragment().getSpatialFragment();

        Assert.assertEquals(0.0,fragment.getX(),0);
        Assert.assertEquals(0.0,fragment.getY(),0);
        Assert.assertEquals(3.0,fragment.getWidth(),0);
        Assert.assertEquals(3.0,fragment.getHeight(),0);
    }

    @Test
    public void testBoundingBoxFunctionWithQueryFragments() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST3a);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?f1 ?f2 (mm:spatialBoundingBox(?f1,?f2) AS ?box) WHERE {" +
                        "   ?f1 rdfs:label \"1_1\"." +
                        "   ?f2 rdfs:label \"1_2\"." +
                        "}";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 1);

        String box = list.get(0).getBinding("box").getValue().stringValue();

        SpatialFragment fragment = (new MediaFragmentURI(box)).getMediaFragment().getSpatialFragment();

        Assert.assertEquals(0.0,fragment.getX(),0);
        Assert.assertEquals(0.0,fragment.getY(),0);
        Assert.assertEquals(3.0,fragment.getWidth(),0);
        Assert.assertEquals(3.0,fragment.getHeight(),0);
    }

    @Test
    public void testBoundingBoxFunctionPercent() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST6);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT (mm:spatialBoundingBox(?l1,?l2) AS ?box) WHERE {" +
                        "   <http://test.org/resource/fragment1> ma:locator ?l1." +
                        "   <http://test.org/resource/fragment2> ma:locator ?l2." +
                        "}";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        Assert.assertTrue(r.hasNext());

        BindingSet set = r.next();

        Assert.assertFalse(r.hasNext());

        String box = set.getBinding("box").getValue().stringValue();

        SpatialFragment fragment = (new MediaFragmentURI(box)).getMediaFragment().getSpatialFragment();

        Assert.assertEquals(0.0,fragment.getX(),0);
        Assert.assertEquals(0.0,fragment.getY(),0);
        Assert.assertEquals(75.0,fragment.getWidth(),0);
        Assert.assertEquals(75.0,fragment.getHeight(),0);
    }

    @Test
    public void testIntersectionFunctionPercent() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST6);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT (mm:spatialIntersection(?l1,?l2) AS ?box) WHERE {" +
                        "   <http://test.org/resource/fragment1> ma:locator ?l1." +
                        "   <http://test.org/resource/fragment2> ma:locator ?l2." +
                        "}";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        Assert.assertTrue(r.hasNext());

        BindingSet set = r.next();

        Assert.assertFalse(r.hasNext());

        String box = set.getBinding("box").getValue().stringValue();

        SpatialFragment fragment = (new MediaFragmentURI(box)).getMediaFragment().getSpatialFragment();

        Assert.assertEquals(25.0,fragment.getX(),0);
        Assert.assertEquals(25.0,fragment.getY(),0);
        Assert.assertEquals(25.0,fragment.getWidth(),0);
        Assert.assertEquals(25.0,fragment.getHeight(),0);
    }

    @Test
    public void testIntersectionFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST3);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?f1 ?f2 (mm:spatialIntersection(?f1,?f2) AS ?box) WHERE {" +
                        "   ?f1 rdfs:label \"1_1\"." +
                        "   ?f2 rdfs:label \"1_2\"." +
                        "}";

        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 1);

        String box = list.get(0).getBinding("box").getValue().stringValue();

        SpatialFragment fragment = (new MediaFragmentURI(box)).getMediaFragment().getSpatialFragment();

        Assert.assertEquals(1.0,fragment.getX(),0);
        Assert.assertEquals(1.0,fragment.getY(),0);
        Assert.assertEquals(1.0,fragment.getWidth(),0);
        Assert.assertEquals(1.0,fragment.getHeight(),0);
    }
}
