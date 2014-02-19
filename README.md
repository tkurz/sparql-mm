# SPARQL-MM
## Extending SPARQL to Multimedia

SPARQL-MM is a multimedia-extension for [SPARQL 1.1](http://www.w3.org/TR/sparql11-query/) implemented for [Sesame](http://www.openrdf.org/).
By now it supports relation and aggregation functions for Media Fragments [URI 1.0](http://www.w3.org/TR/media-frags/), more features are coming soon.

## Examples
Here we just show a few functions that are supported. Get more examples within the [tests](https://github.com/tkurz/sparql-mm/blob/master/src/test/java/com/github/tkurz/sparqlmm).
All list of all supported functions can be found [here](https://github.com/tkurz/sparql-mm/blob/master/doc/sparql-mm-functions.md).

### Temporal Relations

```SPARQL
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX mmt: <http://linkedmultimedia.org/sparql-mm/functions/temporal#>

SELECT ?t1 ?t2 WHERE {
    ?f1 rdfs:label ?t1.
    ?f2 rdfs:label ?t2.
    FILTER mmt:before(?f1,?f2)
} ORDER BY ?t1 ?t2
```

### Temporal Functions

```SPARQL
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX mmt:  <http://linkedmultimedia.org/sparql-mm/functions/temporal#>

SELECT ?f1 ?f2 (mmt:boundingBox(?f1,?f2) AS ?box) WHERE {
    ?f1 rdfs:label "a".
    ?f2 rdfs:label "b".
}
```

### Spatial Relations

```SPARQL
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX mms: <http://linkedmultimedia.org/sparql-mm/functions/spatial#>

SELECT ?t1 ?t2 WHERE {
    ?f1 rdfs:label ?t1.
    ?f2 rdfs:label ?t2.
    FILTER mms:covers(?f1,?f2)
} ORDER BY ?t1 ?t2
```

```SPARQL
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX mms: <http://linkedmultimedia.org/sparql-mm/functions/spatial#>

SELECT ?t WHERE {
    ?f rdfs:label ?t.
    FILTER mms:top(?f1)
} ORDER BY ?t1 ?t2
```

### Spatial Functions

```SPARQL
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX mmt:  <http://linkedmultimedia.org/sparql-mm/functions/temporal#>

SELECT ?f1 ?f2 (mms:intersection(?f1,?f2) AS ?box) WHERE {
    ?f1 rdfs:label "a".
    ?f2 rdfs:label "b".
}
```
