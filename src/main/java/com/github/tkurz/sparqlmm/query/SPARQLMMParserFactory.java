package com.github.tkurz.sparqlmm.query;

import org.openrdf.query.QueryLanguage;
import org.openrdf.query.parser.QueryParser;
import org.openrdf.query.parser.QueryParserFactory;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
public class SPARQLMMParserFactory implements QueryParserFactory {

    private static final QueryLanguage SPARQLMM = new QueryLanguage("SPARQLMM");

    private static final QueryParser parser = new SPARQLMMParser();

    @Override
    public QueryLanguage getQueryLanguage() {
        return SPARQLMM;
    }

    @Override
    public QueryParser getParser() {
        return parser;
    }
}
