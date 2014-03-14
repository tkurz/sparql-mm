## SPARQL-MM Function Library

The URI for this vocabulary is

```
http://linkedmultimedia.org/sparql-mm/functions#
```

When abbreviating terms the suggested prefix is `mm`.

Each function in this function set has a URI constructed by appending a term name to the vocabulary URI. For example:

```
http://linkedmultimedia.org/sparql-mm/functions#after
```

There are machine readable function description using [SPARQL Extension Description Vocabulary](http://www.ldodds.com/schemas/sparql-extension-description/) in
[RDF/XML](https://raw.github.com/tkurz/sparql-mm/master/doc/functions.xml) and [Turtle](https://raw.github.com/tkurz/sparql-mm/master/doc/functions.ttl) Format.

### Temporal Relations

| Relation name | Description |
| :------------ |:------------|
| mm:after( *resource1*, *resource2* ) | returns *true* if resource1.start >= resource2.end, else *false*. |
| mm:before( *resource1*, *resource2* ) | returns *true* if resource1.end <= resource2.start, else *false*. |
| mm:temporalContains( *resource1*, *resource2* [, *flag* ] ) | returns *true* if resource1.start <= resource2.start and resource1.end >= resource2.end, else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |
| mm:temporalEqual( *resource1*, *resource2* ) | returns *true* if resource1.start == resource2.start and resource1.end == resource2.end, else *false*. |
| mm:finishes( *resource1*, *resource2* [, *flag* ]  ) | returns *true* if resource1.end == resource2.end and resource1.start > resource1.start , else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |
| mm:temporalMeets( *resource1*, *resource2* ) | returns *true* if resource1.start = resource2.end or resource1.end = resource2.start, else *false*. |
| mm:temporalOverlaps( *resource1*, *resource2* [, *flag* ] ) | returns *true* if resource1.start < resource2.start < resource1.end < resource2.end or resource2.start < resource1.start < resource2.end < resource1.end, else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |
| mm:starts( *resource1*, *resource2* [, *flag* ]  ) | returns *true* if resource1.start == resource2.start and resource1.end < resource2.end , else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |

### Temporal Functions

| Function name | Description |
| :------------ |:------------|
| mm:temporalBoundingBox( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with temporal fragment ( Min( resource1.start, resource2.start ), Max( resource1.end, resource2.end ) ). |
| mm:temporalIntermediate( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with temporal fragment ( Min( resource1.end, resource2.end ), Max( resource1.start, resource2.start ) ) if intersection not exists, else *null*. |
| mm:temporalIntersection( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with temporal fragment ( Max( resource1.start, resource2.start ), Min( resource1.end, resource2.end ) ) if intersection exists, else *null*. |

### Topological Relations

| Relation name | Description |
| :------------ |:------------|
| mm:temporalCovers( *resource1*, *resource2* [, *flag* ] ) | returns *true* if all points of resource1.box are points of resource2.box, else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |
| mm:temporalDisjoint( *resource1*, *resource2* ) | returns *true* is resource1.box has no common points with resource2.box, else *false*.  |
| mm:temporalEqual( *resource1*, *resource2* ) | returns *true* if resource1.box == resource2.box, else *false*. |
| mm:temporalIntersects( *resource1*, *resource2* [, *flag* ] ) | returns *true* if resource1.box has at least one common point with resource2.box, else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |
| mm:temporalTouches( *resource1*, *resource2* ) | returns *true* if resource1.box.edge has at least one common point with resource2.box.edge and resource1.box.interior has no common point with resource2.box.interior, else *false*. |

### Directional Relations

| Relation name | Description |
| :------------ |:------------|
| mm:bottom( *resource* ) | returns *true* if resource.y >= 50%. |
| mm:isAbove( *resource1*, *resource2* ) | returns *true* if resource1.y + resource1.h <= resource2.y, else *false*. |
| mm:isBelow( *resource1*, *resource2* ) | returns *true* if resource2.y + resource2.h <= resource1.y, else *false*. |
| mm:left( *resource* ) | returns *true* if resource.x + resource.w <= 50%. |
| mm:leftBeside( *resource1*, *resource2* ) | returns *true* if resource1.x + resource1.w <= resource2.x, else *false*. |
| mm:right( *resource* ) | returns *true* if resource.x >= 50%. |
| mm:rightBeside( *resource1*, *resource2* ) | returns *true* if resource2.x + resource2.w <= resource1.x, else *false*. |
| mm:top( *resource* ) | returns *true* if resource.y + resource.h <= 50%. |

### Spatial Functions

| Function name | Description |
| :------------ |:------------|
| mm:spatialBoundingBox( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with spatial fragment out of existing resources A and B, so that x = min( A.x, B.x ) and y = min( A.y, B.y ) and w = max( A.x + A.w, B.x + B.w ) and h = max( A.y + A.h, B.y + B.h ). |
| mm:spatialIntersection( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with spatial fragment out of existing resources A and B, so that x = max( A.x, B.x ) and y = max( A.y, B.y ) and w = min( A.x + A.w, B.x + B.w ) - max( A.x, B.x ) and h = min( A.y + A.h, B.y + B.h ) - max( A.y, A.x ) |

### Combined Functions

| Function name | Description |
| :------------ |:------------|
| mm:boundingBox( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with spatial and temporal fragment. It it works like spatialFunction:boundingBox, temporalFunction:boundingBox or both together. |
| mm:intersection( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with spatial and temporal fragment. It works like spatialFunction:boundingBox, temporalFunction:intersection and both. |