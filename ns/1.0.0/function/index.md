# SPARQL-MM Function Library for Media Fragments

The URI for this vocabulary is

```
http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#
```

When abbreviating terms the suggested prefix is `mf`

Each function in this function set has a URI constructed by appending a term name to the vocabulary URI. For example:

```
http://linkedmultimedia.org/sparql-mm/functions#after
```

There are machine readable function description using [SPARQL Extension Description Vocabulary](http://www.ldodds.com/schemas/sparql-extension-description/) in [RDF/XML](index.rdf) and [TURTLE](index.ttl).

## Relations

| Relation name | Description |
| :------------ |:------------|
| mf:after( *resource1*, *resource2* ) | returns *true* if resource1.start >= resource2.end, else *false*. |

## Aggregations

| Relation name | Description |
| :------------ |:------------|
