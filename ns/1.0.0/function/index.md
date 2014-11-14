# SPARQL-MM Function Library for Media Fragments

The URI for this vocabulary is

```
http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#
```

When abbreviating terms the suggested prefix is `mf`

Each function in this function set has a URI constructed by appending a term name to the vocabulary URI. For example:

```
http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#after
```

There are machine readable function description using [SPARQL Extension Description Vocabulary](http://www.ldodds.com/schemas/sparql-extension-description/) in [RDF/XML](index.rdf) and [TURTLE](index.ttl).

## Spatial Relations
| Relation name | Description |
| :------------ |:------------|
| mf:bottom( *resource1*, *resource2* ) | returns true if resource.y >= 50%. |
| mf:isAbove( *resource1*, *resource2* ) | returns true if resource1.y + resource1.h <= resource2.y, else false. |
| mf:isBelow( *resource1*, *resource2* ) | returns true if resource2.y + resource2.h <= resource1.y, else false. |
| mf:left( *resource1*, *resource2* ) | returns true if resource.x + resource.w <= 50%. |
| mf:leftBeside( *resource1*, *resource2* ) | returns true if resource1.x + resource1.w <= resource2.x, else false. |
| mf:right( *resource1*, *resource2* ) | returns true if resource.x >= 50%. |
| mf:rightBeside( *resource1*, *resource2* ) | returns true if resource2.x + resource2.w <= resource1.x, else false. |
| mf:spatialCovers( *resource1*, *resource2* ) | returns true if all points of resource1.box are points of resource2.box, else false.  |
| mf:spatialDisjoint( *resource1*, *resource2* ) | returns true is resource1.box has no common points with resource2.box, else false. |
| mf:spatialEqual( *resource1*, *resource2* ) | returns true if resource1.box == resource2.box, else false. |
| mf:spatialIntersects( *resource1*, *resource2* ) | returns true if resource1.box has at least one common point with resource2.box, else false. |
| mf:spatialTouches( *resource1*, *resource2* ) | returns true if resource1.box.edge has at least one common point with resource2.box.edge and resource1.box.interior has no common point with resource2.box.interior, else false. |
| mf:top( *resource1*, *resource2* ) | returns true if resource.y + resource.h <= 50%. |

## Spatial Aggregations
| Relation name | Description |
| :------------ |:------------|
| mf:spatialBoundingBox( *resource1*, *resource2* ) | returns new MediaFragmentURI with spatial fragment out of existing resources A and B, so that x = min( A.x, B.x ) and y = min( A.y, B.y ) and w = max( A.x + A.w, B.x + B.w ) and h = max( A.y + A.h, B.y + B.h ). |
| mf:spatialIntersection( *resource1*, *resource2* ) | returns new MediaFragmentURI with spatial fragment out of existing resources A and B, so that x = max( A.x, B.x ) and y = max( A.y, B.y ) and w = min( A.x + A.w, B.x + B.w ) - max( A.x, B.x ) and h = min( A.y + A.h, B.y + B.h ) - max( A.y, A.x ) |

## Temporal Relations
| Relation name | Description |
| :------------ |:------------|
| mf:after( *resource1*, *resource2* ) | returns *true* if resource1.start >= resource2.end, else *false*. |
| mf:before( *resource1*, *resource2* ) | returns true if resource1.end <= resource2.start, else false. |
| mf:finishes( *resource1*, *resource2* ) | returns true if resource1.end == resource2.end and resource1.start > resource1.start , else false. |
| mf:temporalMeets( *resource1*, *resource2* ) | returns true if resource1.start = resource2.end or resource1.end = resource2.start, else false. |
| mf:starts( *resource1*, *resource2* ) | returns true if resource1.start == resource2.start and resource1.end < resource2.end , else false. |
| mf:temporalContains( *resource1*, *resource2* ) | returns true if resource1.start <= resource2.start and resource1.end >= resource2.end, else false. |
| mf:temporalEqual( *resource1*, *resource2* ) | returns true if resource1.start == resource2.start and resource1.end == resource2.end, else false. |
| mf:temporalOverlaps( *resource1*, *resource2* ) | returns true if resource1.start < resource2.start < resource1.end < resource2.end or resource2.start < resource1.start < resource2.end < resource1.end, else false. |

## Temporal Aggregations
| Relation name | Description |
| :------------ |:------------|
| mf:temporalBoundingBox( *resource1*, *resource2* ) | returns new MediaFragmentURI with temporal fragment ( Min( resource1.start, resource2.start ), Max( resource1.end, resource2.end ) ). |
| mf:temporalIntermediate( *resource1*, *resource2* ) | returns new MediaFragmentURI with temporal fragment ( Min( resource1.end, resource2.end ), Max( resource1.start, resource2.start ) ) if intersection not exists, else null. |
| mf:temporalIntersection( *resource1*, *resource2* ) | returns new MediaFragmentURI with temporal fragment ( Max( resource1.start, resource2.start ), Min( resource1.end, resource2.end ) ) if intersection exists, else null. |

## Combined Relations
| Relation name | Description |
| :------------ |:------------|

## Combined Aggregations
| Relation name | Description |
| :------------ |:------------|
| mf:boundingBox( *resource1*, *resource2* ) | returns new MediaFragmentURI with spatial and temporal fragment. It it works like spatialFunction:boundingBox, temporalFunction:boundingBox or both together. |
| mf:intersection( *resource1*, *resource2* ) | returns new MediaFragmentURI with spatial and temporal fragment. It works like spatialFunction:boundingBox, temporalFunction:intersection and both. |

