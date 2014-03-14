## SPARQL-MM Function Library

The prefix **mmt** is <http://linkedmultimedia.org/sparql-mm/functions/temporal#>.

The prefix **mms** is <http://linkedmultimedia.org/sparql-mm/functions/spatial#>.

The prefix **mmc** is <http://linkedmultimedia.org/sparql-mm/functions/combined#>.

### Temporal Relations

| Relation name | Description |
| :------------ |:------------|
| mmt:after( *resource1*, *resource2* ) | returns *true* if resource1.start >= resource2.end, else *false*. |
| mmt:before( *resource1*, *resource2* ) | returns *true* if resource1.end <= resource2.start, else *false*. |
| mmt:contains( *resource1*, *resource2* [, *flag* ] ) | returns *true* if resource1.start <= resource2.start and resource1.end >= resource2.end, else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |
| mmt:equal( *resource1*, *resource2* ) | returns *true* if resource1.start == resource2.start and resource1.end == resource2.end, else *false*. |
| mmt:finishes( *resource1*, *resource2* [, *flag* ]  ) | returns *true* if resource1.end == resource2.end and resource1.start > resource1.start , else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |
| mmt:meets( *resource1*, *resource2* ) | returns *true* if resource1.start = resource2.end or resource1.end = resource2.start, else *false*. |
| mmt:overlaps( *resource1*, *resource2* [, *flag* ] ) | returns *true* if resource1.start < resource2.start < resource1.end < resource2.end or resource2.start < resource1.start < resource2.end < resource1.end, else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |
| mmt:starts( *resource1*, *resource2* [, *flag* ]  ) | returns *true* if resource1.start == resource2.start and resource1.end < resource2.end , else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |

### Temporal Functions

| Function name | Description |
| :------------ |:------------|
| mmt:boundingBox( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with temporal fragment ( Min( resource1.start, resource2.start ), Max( resource1.end, resource2.end ) ). |
| mmt:intermediate( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with temporal fragment ( Min( resource1.end, resource2.end ), Max( resource1.start, resource2.start ) ) if intersection not exists, else *null*. |
| mmt:intersection( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with temporal fragment ( Max( resource1.start, resource2.start ), Min( resource1.end, resource2.end ) ) if intersection exists, else *null*. |

### Topological Relations

| Relation name | Description |
| :------------ |:------------|
| mms:covers( *resource1*, *resource2* [, *flag* ] ) | returns *true* if all points of resource1.box are points of resource2.box, else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |
| mms:disjoint( *resource1*, *resource2* ) | returns *true* is resource1.box has no common points with resource2.box, else *false*.  |
| mms:equal( *resource1*, *resource2* ) | returns *true* if resource1.box == resource2.box, else *false*. |
| mms:intersects( *resource1*, *resource2* [, *flag* ] ) | returns *true* if resource1.box has at least one common point with resource2.box, else *false*. Boolean *flag* can define if *equal* is included in the result, default is *false*. |
| mms:touches( *resource1*, *resource2* ) | returns *true* if resource1.box.edge has at least one common point with resource2.box.edge and resource1.box.interior has no common point with resource2.box.interior, else *false*. |

### Directional Relations

| Relation name | Description |
| :------------ |:------------|
| mms:bottom( *resource* ) | returns *true* if resource.y >= 50%. |
| mms:isAbove( *resource1*, *resource2* ) | returns *true* if resource1.y + resource1.h <= resource2.y, else *false*. |
| mms:isBelow( *resource1*, *resource2* ) | returns *true* if resource2.y + resource2.h <= resource1.y, else *false*. |
| mms:left( *resource* ) | returns *true* if resource.x + resource.w <= 50%. |
| mms:leftBeside( *resource1*, *resource2* ) | returns *true* if resource1.x + resource1.w <= resource2.x, else *false*. |
| mms:right( *resource* ) | returns *true* if resource.x >= 50%. |
| mms:rightBeside( *resource1*, *resource2* ) | returns *true* if resource2.x + resource2.w <= resource1.x, else *false*. |
| mms:top( *resource* ) | returns *true* if resource.y + resource.h <= 50%. |

### Spatial Functions

| Function name | Description |
| :------------ |:------------|
| mms:boundingBox( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with spatial fragment out of existing resources A and B, so that x = min( A.x, B.x ) and y = min( A.y, B.y ) and w = max( A.x + A.w, B.x + B.w ) and h = max( A.y + A.h, B.y + B.h ). |
| mms:intersection( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with spatial fragment out of existing resources A and B, so that x = max( A.x, B.x ) and y = max( A.y, B.y ) and w = min( A.x + A.w, B.x + B.w ) - max( A.x, B.x ) and h = min( A.y + A.h, B.y + B.h ) - max( A.y, A.x ) |

### Combined Functions

| Function name | Description |
| :------------ |:------------|
| mmc:boundingBox( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with spatial and temporal fragment. It is a combination of spatialFunction:boundingBox and temporalFunction:boundingBox. |
| mmc:intersection( *resource1*, *resource2* ) | returns new *MediaFragmentURI* with spatial and temporal fragment. It is a combination of spatialFunction:boundingBox and temporalFunction:intersection. |