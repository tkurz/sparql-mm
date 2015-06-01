# SPARQL-MM
## Extending SPARQL to Multimedia

SPARQL-MM is a multimedia-extension for [SPARQL 1.1](http://www.w3.org/TR/sparql11-query/) implemented for [Sesame](http://www.openrdf.org/).
By now it supports relation, aggregation and accessor functions for Media Fragments [URI 1.0](http://www.w3.org/TR/media-frags/) - and features
are constantly extended.

## Usage
SPARQL-MM can easily appended to any Sesame Triplestore via Java Class Loader Technology. The package is available on
[Maven Central](http://search.maven.org/#artifactdetails%7Ccom.github.tkurz%7Csparql-mm%7C1.0%7Cjar).

```XML
<dependency>
    <groupId>com.github.tkurz</groupId>
    <artifactId>sparql-mm</artifactId>
    <version>1.0</version>
</dependency>
```

## Examples
Here we just show a few functions that are supported. Get more examples within the [tests](https://github.com/tkurz/sparql-mm/blob/master/src/test/java/com/github/tkurz/sparqlmm).
All list of all supported functions can be found [here](https://github.com/tkurz/sparql-mm/blob/master/ns/1.0.0/function/index.md).

### Temporal Relations

```SPARQL
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX mm: <http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#>

SELECT ?t1 ?t2 WHERE {
    ?f1 rdfs:label ?t1.
    ?f2 rdfs:label ?t2.
    FILTER mm:precedes(?f1,?f2)
} ORDER BY ?t1 ?t2
```

### Temporal Aggregation

```SPARQL
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX mm:  <http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#>

SELECT ?f1 ?f2 (mm:temporalIntermediate(?f1,?f2) AS ?box) WHERE {
    ?f1 rdfs:label "a".
    ?f2 rdfs:label "b".
}
```

### Spatial Relations

```SPARQL
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX mm: <http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#>

SELECT ?t1 ?t2 WHERE {
    ?f1 rdfs:label ?t1.
    ?f2 rdfs:label ?t2.
    FILTER mm:rightBeside(?f1,?f2)
} ORDER BY ?t1 ?t2
```

### Spatial Aggregation

```SPARQL
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX mm:  <http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#>

SELECT ?f1 ?f2 (mm:spatialIntersection(?f1,?f2) AS ?box) WHERE {
    ?f1 rdfs:label "a".
    ?f2 rdfs:label "b".
}
```

### Combined Aggregation

```SPARQL
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX mm:  <http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#>

SELECT ?f1 ?f2 (mm:boundingBox(?f1,?f2) AS ?box) WHERE {
    ?f1 rdfs:label "a".
    ?f2 rdfs:label "b".
}
```

### Accessor Method

```SPARQL
PREFIX ma: <http://www.w3.org/ns/ma-ont#>
PREFIX mm: <http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#>

SELECT ?f1 WHERE {
    ?f1 a ma:MediaFragment.
} ORDER BY mm:duration(?f1)
```