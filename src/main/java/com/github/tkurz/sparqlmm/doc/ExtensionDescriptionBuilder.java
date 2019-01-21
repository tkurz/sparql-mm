package com.github.tkurz.sparqlmm.doc;

import com.github.tkurz.sparqlmm.Constants;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFHandlerException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
public class ExtensionDescriptionBuilder {

    public static final String FUNCTION_NAMES = "META-INF/services/org.openrdf.query.algebra.evaluation.function.Function";

    public static void main(String [] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, RDFHandlerException {

        List<String> functionNames = Resources.readLines(Resources.getResource(FUNCTION_NAMES), Charset.forName("UTF-8"));

        FunctionSet functionSet = new FunctionSet(functionNames);

        String baseString = "sparql-mm/ns/" + Constants.VERSION + "/function/";

        File ttl = new File(baseString + "index.ttl");
        Files.createParentDirs(ttl);
        functionSet.toRDF(ttl, RDFFormat.TURTLE);

        File rdf = new File(baseString + "index.rdf");
        Files.createParentDirs(rdf);
        functionSet.toRDF(rdf, RDFFormat.RDFXML);

        File md = new File(baseString + "index.md");
        Files.createParentDirs(md);
        functionSet.toMD(md);

        File html = new File(baseString + "index.html");
        Files.createParentDirs(html);
        functionSet.toHTML(html);

        File latex = new File(baseString + "index.tex");
        Files.createParentDirs(latex);
        functionSet.toLatex(latex);

    }

}
