package com.github.tkurz.sparqlmm.utils;

import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.vocabularies.SCHEMA;
import com.github.tkurz.sparqlmm.vocabularies.SED;
import com.google.common.io.Files;
import org.openrdf.model.Model;
import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.LinkedHashModel;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.Rio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
public class FunctionSet {

    private static Logger logger = LoggerFactory.getLogger(FunctionSet.class);

    public static String URL = Constants.NAMESPACE.substring(0, Constants.NAMESPACE.length()-1);
    public static String TITLE = "SPARQL-MM Function Library for Media Fragments";
    public static String DESCRIPTION = "SPARQL Function Library for handling Media Fragments URI like they are recommended from W3C at http://www.w3.org/TR/media-frags/ Media Fragments URI 1.0 (basic) recommendation.";
    public static String CREATOR = "http://github.com/tkurz";
    public static String PUBLISHER = "http://mico-project.eu";
    public static String LICENSE = "http://www.apache.org/licenses/LICENSE-2.0";
    public static String HOMEPAGE = "http://github.com/tkurz/sparql-mm";

    public static String LINK_TURTLE = "index.ttl";
    public static String LINK_XML = "index.rdf";

    public static String STYLE_URL = "style.css";

    private List<Function> functions = new ArrayList<>();
    private Model model = new LinkedHashModel();

    public FunctionSet(List<String> functionNames) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        for(String functionName : functionNames) {
            functions.add(new Function(functionName));
        }

        Collections.sort(functions, new Comparator<Function>() {
            @Override
            public int compare(Function o1, Function o2) {
                return o1.title.compareTo(o2.title);
            }
        });

        //build sesame model
        ValueFactory f = ValueFactoryImpl.getInstance();

        URI vocabulary = f.createURI(URL);
        model.add(vocabulary, RDF.TYPE, SED.FunctionLibrary);
        model.add(vocabulary, SCHEMA.name, f.createLiteral(TITLE));
        model.add(vocabulary, SCHEMA.description, f.createLiteral(DESCRIPTION));
        model.add(vocabulary, SCHEMA.version, f.createLiteral(Constants.VERSION));
        model.add(vocabulary, SCHEMA.creator, f.createURI(CREATOR));
        model.add(vocabulary, SCHEMA.provider, f.createURI(PUBLISHER));
        model.add(vocabulary, f.createURI(SCHEMA.NAMESPACE + "license"), f.createURI(LICENSE));
        model.add(vocabulary, SCHEMA.url, f.createURI(HOMEPAGE));

        for(Function function: functions) {
            model.add(function.uri, RDF.TYPE, function.type);
            model.add(function.uri, SCHEMA.name, f.createLiteral(function.title));
            model.add(function.uri, SCHEMA.description, f.createLiteral(function.description));
            model.add(function.uri, SED.includedIn, vocabulary);
            model.add(vocabulary, SED.includes, function.uri);
        }

    }

    public void toRDF(File file, RDFFormat format) throws RDFHandlerException, IOException {
        Writer writer = Files.newWriter(file, Charset.forName("UTF-8"));
        Rio.write(model, writer, format);
        writer.flush();
        writer.close();
    }

    public void toMD(File file) throws IOException {
        PrintWriter out = new PrintWriter(file);

        out.printf("# %s%n", TITLE);
        out.println();
        out.println("The URI for this vocabulary is");
        out.println();
        out.println("```");
        out.println(Constants.NAMESPACE);
        out.println("```");
        out.println();
        out.printf("When abbreviating terms the suggested prefix is `%s`%n", Constants.ABBREVIATION);
        out.println();
        out.println("Each function in this function set has a URI constructed by appending a term name to the vocabulary URI. For example:");
        out.println();
        out.println("```");
        out.println(functions.get(0).uri.stringValue());
        out.println("```");
        out.println();
        out.print("There are machine readable function description using [SPARQL Extension Description Vocabulary](http://www.ldodds.com/schemas/sparql-extension-description/) in ");
        out.printf("[RDF/XML](%s) and [TURTLE](%s).%n", LINK_XML, LINK_TURTLE);
        out.println();
        for(FunctionDoc.Reference reference : FunctionDoc.Reference.values()) {
            for(FunctionDoc.Type type : FunctionDoc.Type.values()) {
                out.printf("## %s %ss", reference.getName(), type.getName());
                out.println();
                out.println("| Relation name | Description |");
                out.println("| :------------ |:------------|");
                for(Function function: functions) {
                    if(function.reference == reference && function.type.equals(type.getUri())) out.printf("| %s:%s( *resource1*, *resource2* ) | %s |%n", Constants.ABBREVIATION, function.uri.stringValue().substring(Constants.NAMESPACE.length()), function.description);
                }
                out.println();
            }
        }

        out.flush();
        out.close();
    }

    public void toHTML(File file) throws IOException {
        PrintWriter out = new PrintWriter(file);

        out.printf("<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"%s\"></head><body>\n", STYLE_URL);
        out.printf("<h1>%s</h1>%n", TITLE);
        out.println();
        out.println("<p>");
        out.printf("The URI for this vocabulary is <code>%s</code>. ", Constants.NAMESPACE);
        out.printf("When abbreviating terms the suggested prefix is <code>%s</code>. ", Constants.ABBREVIATION);
        out.printf("Each function in this function set has a URI constructed by appending a term name to the vocabulary URI. For example <code>%s</code>. ", functions.get(0).uri.stringValue());
        out.print("There are machine readable function description using <a href=\"http://www.ldodds.com/schemas/sparql-extension-description/\">SPARQL Extension Description Vocabulary]</a> in ");
        out.printf("<a href=\"%s\">RDF/XML</a> and <a href=\"%s\">TURTLE</a>.", LINK_XML, LINK_TURTLE);
        out.println("</p>");
        for(FunctionDoc.Reference reference : FunctionDoc.Reference.values()) {
            for (FunctionDoc.Type type : FunctionDoc.Type.values()) {
                out.printf("<h2>%s %ss</h2>", reference.getName(), type.getName());
                out.println("<table>");
                out.println("<tr><th>Relation name</th><th>Description</th>");
                for (Function function : functions) {
                    if (function.reference == reference && function.type.equals(type.getUri()))
                        out.printf("<tr><td>%s:%s( *resource1*, *resource2* )</td><td>%s</td>\n", Constants.ABBREVIATION, function.uri.stringValue().substring(Constants.NAMESPACE.length()), function.description);
                }
                out.println("</table>");
            }
        }

        out.flush();
        out.close();
    }

    class Function {

        String title, description;
        URI type;
        URI uri;
        FunctionDoc.Reference reference;

        public Function(String className) throws ClassNotFoundException, IOException, IllegalAccessException, InstantiationException {
            Class clazz = Class.forName(className);

            if(clazz.getAnnotation(FunctionDoc.class) == null) throw new IOException("Class " + className + " is not properly annotated for documentation.");

            FunctionDoc doc = (FunctionDoc) clazz.getAnnotation(FunctionDoc.class);
            org.openrdf.query.algebra.evaluation.function.Function function = (org.openrdf.query.algebra.evaluation.function.Function) clazz.newInstance();

            title = doc.title();
            description = doc.description();
            type = doc.type().getUri();
            uri = ValueFactoryImpl.getInstance().createURI(function.getURI());
            reference = doc.reference();

            logger.debug("read doc for {}: uri:{}, title:{}, description:{}", className, uri.stringValue(), title, description);
        }

    }

}