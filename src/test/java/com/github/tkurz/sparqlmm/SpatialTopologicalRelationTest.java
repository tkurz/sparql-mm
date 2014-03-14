package com.github.tkurz.sparqlmm;

import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.spatial.relation.topological.*;
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
public class SpatialTopologicalRelationTest {

    private final String TEST3 = "/test3.ttl";
    private final String BASE_URI = "http://test.org/resource/";

    private RepositoryConnection connection;

    @BeforeClass
    public static void beforeClass() {
        FunctionRegistry.getInstance().add(new CoversFunction());
        FunctionRegistry.getInstance().add(new DisjointFunction());
        FunctionRegistry.getInstance().add(new EqualFunction());
        FunctionRegistry.getInstance().add(new IntersectsFunction());
        FunctionRegistry.getInstance().add(new TouchesFunction());
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
    public void testCoversFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST3);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                "SELECT ?t1 ?t2 WHERE {" +
                "   ?f1 rdfs:label ?t1." +
                "   ?f2 rdfs:label ?t2." +
                "   FILTER mm:spatialCovers(?f1,?f2)" +
                "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 1);

        String t1 = list.get(0).getBinding("t1").getValue().stringValue();
        String t2 = list.get(0).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("2_1",t1);
        Assert.assertEquals("2_2",t2);

        String query2 =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:spatialCovers(?f1,?f2, true)" +
                        "} ORDER BY ?t1 ?t2";
        TupleQuery q2 = connection.prepareTupleQuery(QueryLanguage.SPARQL,query2);
        TupleQueryResult r2 = q2.evaluate();

        ArrayList<BindingSet> list2 = new ArrayList<BindingSet>();
        while(r2.hasNext()) {
            list2.add(r2.next());
        }

        Assert.assertTrue(list2.size() == 8);
    }

    @Test
    public void testDisjointFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST3);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                "SELECT ?t1 ?t2 WHERE {" +
                "   <http://test.org/resource/video1> ma:hasFragment ?f1, ?f2." +
                "   ?f1 rdfs:label ?t1." +
                "   ?f2 rdfs:label ?t2." +
                "   FILTER mm:spatialDisjoint(?f1,?f2)" +
                "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 10);

        for(BindingSet set : list) {
            Assert.assertFalse(
                    set.getBinding("t1").getValue().stringValue().equals("1_1")
                    && set.getBinding("t2").getValue().stringValue().equals("1_2")
            );

            Assert.assertFalse(
                    set.getBinding("t1").getValue().stringValue().equals("1_2")
                    && set.getBinding("t2").getValue().stringValue().equals("1_1")
            );
        }
    }

    @Test
    public void testEqualFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST3);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                "PREFIX mm: <" + Constants.NAMESPACE+ ">" +
                "SELECT ?t1 ?t2 WHERE {" +
                "   ?f1 rdfs:label ?t1." +
                "   ?f2 rdfs:label ?t2." +
                "   FILTER mm:spatialEqual(?f1,?f2)" +
                "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 7);
    }

    @Test
    public void testIntersectsFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST3);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                "SELECT ?t1 ?t2 WHERE {" +
                "   ?f1 rdfs:label ?t1." +
                "   ?f2 rdfs:label ?t2." +
                "   FILTER mm:spatialIntersects(?f1,?f2)" +
                "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        Assert.assertEquals("1_1",list.get(0).getBinding("t1").getValue().stringValue());
        Assert.assertEquals("1_2",list.get(0).getBinding("t2").getValue().stringValue());
        Assert.assertEquals("1_2",list.get(1).getBinding("t1").getValue().stringValue());
        Assert.assertEquals("1_1",list.get(1).getBinding("t2").getValue().stringValue());

        Assert.assertEquals("2_1",list.get(2).getBinding("t1").getValue().stringValue());
        Assert.assertEquals("2_2",list.get(2).getBinding("t2").getValue().stringValue());
        Assert.assertEquals("2_2",list.get(3).getBinding("t1").getValue().stringValue());
        Assert.assertEquals("2_1",list.get(3).getBinding("t2").getValue().stringValue());

        String query2 =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:spatialIntersects(?f1,?f2,true)" +
                        "} ORDER BY ?t1 ?t2";
        TupleQuery q2 = connection.prepareTupleQuery(QueryLanguage.SPARQL,query2);
        TupleQueryResult r2 = q2.evaluate();

        ArrayList<BindingSet> list2 = new ArrayList<BindingSet>();
        while(r2.hasNext()) {
            list2.add(r2.next());
        }

        Assert.assertTrue(list2.size() == 11);
    }

    @Test
    public void testTouchesFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST3);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                "SELECT ?t1 ?t2 WHERE {" +
                "   ?f1 rdfs:label ?t1." +
                "   ?f2 rdfs:label ?t2." +
                "   FILTER mm:spatialTouches(?f1,?f2)" +
                "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        Assert.assertEquals("1_2",list.get(0).getBinding("t1").getValue().stringValue());
        Assert.assertEquals("1_3",list.get(0).getBinding("t2").getValue().stringValue());
        Assert.assertEquals("1_3",list.get(1).getBinding("t1").getValue().stringValue());
        Assert.assertEquals("1_2",list.get(1).getBinding("t2").getValue().stringValue());

        Assert.assertEquals("2_1",list.get(2).getBinding("t1").getValue().stringValue());
        Assert.assertEquals("2_3",list.get(2).getBinding("t2").getValue().stringValue());
        Assert.assertEquals("2_3",list.get(3).getBinding("t1").getValue().stringValue());
        Assert.assertEquals("2_1",list.get(3).getBinding("t2").getValue().stringValue());
    }
}
