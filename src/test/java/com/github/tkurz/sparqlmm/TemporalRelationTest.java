package com.github.tkurz.sparqlmm;

import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.sparqlmm.temporal.function.IntersectionFunction;
import com.github.tkurz.sparqlmm.temporal.relation.*;
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
public class TemporalRelationTest {

    private final String TEST1 = "/test1.ttl";
    private final String TEST2 = "/test2.ttl";
    private final String BASE_URI = "http://test.org/resource/";

    private RepositoryConnection connection;

    @BeforeClass
    public static void beforeClass() {
        FunctionRegistry.getInstance().add(new AfterFunction());
        FunctionRegistry.getInstance().add(new BeforeFunction());
        FunctionRegistry.getInstance().add(new ContainsFunction());
        FunctionRegistry.getInstance().add(new EqualFunction());
        FunctionRegistry.getInstance().add(new FinishesFunction());
        FunctionRegistry.getInstance().add(new MeetsFunction());
        FunctionRegistry.getInstance().add(new OverlapsFunction());
        FunctionRegistry.getInstance().add(new StartsFunction());
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
    public void testAfterFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST1);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                "SELECT ?t1 ?t2 WHERE {" +
                "   ?f1 rdfs:label ?t1." +
                "   ?f2 rdfs:label ?t2." +
                "   FILTER mm:after(?f1,?f2)" +
                "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 13);

        for(BindingSet set : list) {
            String t1 = set.getBinding("t1").getValue().stringValue();
            String t2 = set.getBinding("t2").getValue().stringValue();

            Assert.assertEquals(t1.charAt(0),t2.charAt(0));
            Assert.assertTrue( Integer.valueOf(t1.charAt(2)) > Integer.valueOf(t2.charAt(2)) );
        }
    }

    @Test
    public void testBeforeFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST1);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:before(?f1,?f2)" +
                        "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 13);

        for(BindingSet set : list) {
            String t1 = set.getBinding("t1").getValue().stringValue();
            String t2 = set.getBinding("t2").getValue().stringValue();

            Assert.assertEquals(t1.charAt(0),t2.charAt(0));
            Assert.assertTrue( Integer.valueOf(t1.charAt(2)) < Integer.valueOf(t2.charAt(2)) );
        }
    }

    @Test
    public void testContainsFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST1);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:temporalContains(?f1,?f2)" +
                        "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        Assert.assertTrue(r.hasNext());

        BindingSet set = r.next();
        Assert.assertEquals("2_4",set.getBinding("t1").getValue().stringValue());
        Assert.assertEquals("2_5",set.getBinding("t2").getValue().stringValue());

        Assert.assertFalse(r.hasNext());

        String query1 =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:temporalContains(?f1,?f2,true)" +
                        "} ORDER BY ?t1 ?t2";
        TupleQuery q1 = connection.prepareTupleQuery(QueryLanguage.SPARQL,query1);
        TupleQueryResult r1 = q1.evaluate();

        Assert.assertTrue(r1.hasNext());

        int size = 0;
        while(r1.hasNext()) {
            size++;
            r1.next();
        }

        Assert.assertEquals(10, size);
    }

    @Test
    public void testEqualFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST1);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:temporalEqual(?f1,?f2)" +
                        "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 9);

        for(BindingSet set : list) {
            String t1 = set.getBinding("t1").getValue().stringValue();
            String t2 = set.getBinding("t2").getValue().stringValue();

            Assert.assertEquals(t1,t2);
        }
    }

    @Test
    public void testFinishesFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST2);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:finishes(?f1,?f2,true)" +
                        "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 8);

        //test without equals
        query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:finishes(?f1,?f2)" +
                        "} ORDER BY ?t1 ?t2";
        q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        r = q.evaluate();

        list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 1);

        String t1 = list.get(0).getBinding("t1").getValue().stringValue();
        String t2 = list.get(0).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("1_4",t1);
        Assert.assertEquals("1_3",t2);
    }

    @Test
    public void testMeetsFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST1);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:temporalMeets(?f1,?f2)" +
                        "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        String t1 = list.get(0).getBinding("t1").getValue().stringValue();
        String t2 = list.get(0).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("1_1",t1);
        Assert.assertEquals("1_2",t2);

        String t3 = list.get(1).getBinding("t1").getValue().stringValue();
        String t4 = list.get(1).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("1_2",t3);
        Assert.assertEquals("1_1",t4);

        String t5 = list.get(2).getBinding("t1").getValue().stringValue();
        String t6 = list.get(2).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("2_1",t5);
        Assert.assertEquals("2_2",t6);

        String t7 = list.get(3).getBinding("t1").getValue().stringValue();
        String t8 = list.get(3).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("2_2",t7);
        Assert.assertEquals("2_1",t8);
    }

    @Test
    public void testOverlapsFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST1);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:temporalOverlaps(?f1,?f2)" +
                        "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 6);

        String t1 = list.get(0).getBinding("t1").getValue().stringValue();
        String t2 = list.get(0).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("1_3",t1);
        Assert.assertEquals("1_4",t2);

        String t3 = list.get(1).getBinding("t1").getValue().stringValue();
        String t4 = list.get(1).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("1_4",t3);
        Assert.assertEquals("1_3",t4);

        String t5 = list.get(2).getBinding("t1").getValue().stringValue();
        String t6 = list.get(2).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("2_3",t5);
        Assert.assertEquals("2_4",t6);

        String t7 = list.get(3).getBinding("t1").getValue().stringValue();
        String t8 = list.get(3).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("2_4",t7);
        Assert.assertEquals("2_3",t8);
    }

    @Test
    public void testStartsFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST2);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:starts(?f1,?f2,true)" +
                        "} ORDER BY ?t1 ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 9);

        //test without equals
        query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 WHERE {" +
                        "   ?f1 rdfs:label ?t1." +
                        "   ?f2 rdfs:label ?t2." +
                        "   FILTER mm:starts(?f1,?f2)" +
                        "} ORDER BY ?t1 ?t2";
        q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        r = q.evaluate();

        list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 2);

        String t1 = list.get(0).getBinding("t1").getValue().stringValue();
        String t2 = list.get(0).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("1_2",t1);
        Assert.assertEquals("1_1",t2);

        String t3 = list.get(1).getBinding("t1").getValue().stringValue();
        String t4 = list.get(1).getBinding("t2").getValue().stringValue();

        Assert.assertEquals("2_2",t3);
        Assert.assertEquals("2_1",t4);
    }

}
