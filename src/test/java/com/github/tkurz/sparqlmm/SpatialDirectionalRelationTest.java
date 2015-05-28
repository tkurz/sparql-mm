package com.github.tkurz.sparqlmm;

import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.sparqlmm.function.spatial.relation.directional.*;
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
public class SpatialDirectionalRelationTest {

    private final String TEST4 = "/test4.ttl";
    private final String TEST5 = "/test5.ttl";
    private final String BASE_URI = "http://test.org/resource/";

    private RepositoryConnection connection;

    @BeforeClass
    public static void beforeClass() {
        FunctionRegistry.getInstance().add(new AboveFunction());
        FunctionRegistry.getInstance().add(new BelowFunction());
        FunctionRegistry.getInstance().add(new LeftBesideFunction());
        FunctionRegistry.getInstance().add(new RightBesideFunction());
        FunctionRegistry.getInstance().add(new RightBelowFunction());
        FunctionRegistry.getInstance().add(new LeftBelowFunction());
        FunctionRegistry.getInstance().add(new RightAboveFunction());
        FunctionRegistry.getInstance().add(new LeftAboveFunction());
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
    public void testRightBesideFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST4);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                "SELECT ?t1 ?t2 (mm:rightBeside(?f1,?f2) AS ?test) WHERE {" +
                "   ?f1 rdfs:label \"1_2\";" +
                "       rdfs:label ?t1." +
                "   ?f2 a ma:MediaFragment;" +
                "       rdfs:label ?t2." +
                "} ORDER BY ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        Assert.assertEquals("true",list.get(0).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(1).getBinding("test").getValue().stringValue());
        Assert.assertEquals("true",list.get(2).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(3).getBinding("test").getValue().stringValue());
    }

    @Test
    public void testLeftBesideFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST4);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 (mm:leftBeside(?f1,?f2) AS ?test) WHERE {" +
                        "   ?f1 rdfs:label \"1_1\";" +
                        "       rdfs:label ?t1." +
                        "   ?f2 a ma:MediaFragment;" +
                        "       rdfs:label ?t2." +
                        "} ORDER BY ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        Assert.assertEquals("false",list.get(0).getBinding("test").getValue().stringValue());
        Assert.assertEquals("true",list.get(1).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(2).getBinding("test").getValue().stringValue());
        Assert.assertEquals("true",list.get(3).getBinding("test").getValue().stringValue());
    }

    @Test
    public void testIsAboveFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST4);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 (mm:above(?f1,?f2) AS ?test) WHERE {" +
                        "   ?f1 rdfs:label \"1_1\";" +
                        "       rdfs:label ?t1." +
                        "   ?f2 a ma:MediaFragment;" +
                        "       rdfs:label ?t2." +
                        "} ORDER BY ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        Assert.assertEquals("false",list.get(0).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(1).getBinding("test").getValue().stringValue());
        Assert.assertEquals("true",list.get(2).getBinding("test").getValue().stringValue());
        Assert.assertEquals("true",list.get(3).getBinding("test").getValue().stringValue());
    }

    @Test
    public void testIsBelowFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST4);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 (mm:below(?f1,?f2) AS ?test) WHERE {" +
                        "   ?f1 rdfs:label \"1_3\";" +
                        "       rdfs:label ?t1." +
                        "   ?f2 a ma:MediaFragment;" +
                        "       rdfs:label ?t2." +
                        "} ORDER BY ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        Assert.assertEquals("true",list.get(0).getBinding("test").getValue().stringValue());
        Assert.assertEquals("true",list.get(1).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(2).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(3).getBinding("test").getValue().stringValue());
    }

    @Test
    public void testIsLeftBelowFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST4);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 (mm:leftBelow(?f1,?f2) AS ?test) WHERE {" +
                        "   ?f1 rdfs:label \"1_3\";" +
                        "       rdfs:label ?t1." +
                        "   ?f2 a ma:MediaFragment;" +
                        "       rdfs:label ?t2." +
                        "} ORDER BY ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        Assert.assertEquals("false",list.get(0).getBinding("test").getValue().stringValue());
        Assert.assertEquals("true",list.get(1).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(2).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(3).getBinding("test").getValue().stringValue());
    }

    @Test
    public void testIsRightBelowFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST4);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 (mm:rightBelow(?f1,?f2) AS ?test) WHERE {" +
                        "   ?f1 rdfs:label \"1_4\";" +
                        "       rdfs:label ?t1." +
                        "   ?f2 a ma:MediaFragment;" +
                        "       rdfs:label ?t2." +
                        "} ORDER BY ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        Assert.assertEquals("true",list.get(0).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(1).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(2).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(3).getBinding("test").getValue().stringValue());
    }

    @Test
    public void testIsRightAboveFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST4);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 (mm:rightAbove(?f1,?f2) AS ?test) WHERE {" +
                        "   ?f1 rdfs:label \"1_2\";" +
                        "       rdfs:label ?t1." +
                        "   ?f2 a ma:MediaFragment;" +
                        "       rdfs:label ?t2." +
                        "} ORDER BY ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        Assert.assertEquals("false",list.get(0).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(1).getBinding("test").getValue().stringValue());
        Assert.assertEquals("true",list.get(2).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(3).getBinding("test").getValue().stringValue());
    }

    @Test
    public void testIsLeftAboveFunction() throws MalformedQueryException, RepositoryException, QueryEvaluationException, MediaFragmentURISyntaxException, RDFParseException, IOException {

        importFile(TEST4);

        String query =
                "PREFIX ma: <http://www.w3.org/ns/ma-ont#>" +
                        "PREFIX mm: <" + Constants.NAMESPACE + ">" +
                        "SELECT ?t1 ?t2 (mm:leftAbove(?f1,?f2) AS ?test) WHERE {" +
                        "   ?f1 rdfs:label \"1_1\";" +
                        "       rdfs:label ?t1." +
                        "   ?f2 a ma:MediaFragment;" +
                        "       rdfs:label ?t2." +
                        "} ORDER BY ?t2";
        TupleQuery q = connection.prepareTupleQuery(QueryLanguage.SPARQL,query);
        TupleQueryResult r = q.evaluate();

        ArrayList<BindingSet> list = new ArrayList<BindingSet>();
        while(r.hasNext()) {
            list.add(r.next());
        }

        Assert.assertTrue(list.size() == 4);

        Assert.assertEquals("false",list.get(0).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(1).getBinding("test").getValue().stringValue());
        Assert.assertEquals("false",list.get(2).getBinding("test").getValue().stringValue());
        Assert.assertEquals("true",list.get(3).getBinding("test").getValue().stringValue());
    }
}
