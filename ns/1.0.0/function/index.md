# SPARQL-MM Function Library for Media Fragments

The URI for this vocabulary is

```
http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#
```

When abbreviating terms the suggested prefix is `mm`

Each function in this function set has a URI constructed by appending a term name to the vocabulary URI. For example:

```
http://linkedmultimedia.org/sparql-mm/ns/1.0.0/function#getBoxArea
```

There are machine readable function description using [SPARQL Extension Description Vocabulary](http://www.ldodds.com/schemas/sparql-extension-description/) in [RDF/XML](index.rdf) and [TURTLE](index.ttl).

## Spatial Relations
| Relation name | Description |
| :------------ |:------------|
| mm:intersects( *SpatialEntity*, *SpatialEntity* ) | returns true if p1 has at least one common point with p2, else false. |
| mm:within( *SpatialEntity*, *SpatialEntity* ) | returns true if p1.shape contains all points of p2.shape an p1.shape.edge has not point in common with p2.shape.edge, else false. |
| mm:above( *SpatialEntity*, *SpatialEntity* ) | returns true p1 if is above p2 (based on model m), else false. |
| mm:below( *SpatialEntity*, *SpatialEntity* ) | returns true p1 if is below p2 (based on model m), else false. |
| mm:coveredBy( *SpatialEntity*, *SpatialEntity* ) | is the inverse function to covers. |
| mm:covers( *SpatialEntity*, *SpatialEntity* ) | returns true if all points of p1.shape are points of p2.shape, else false.  |
| mm:crosses( *SpatialEntity*, *SpatialEntity* ) | returns true if p1.shape and p2.shape have common points and p1.shape.edge and p2.shape.edge has common points, else false. |
| mm:leftAbove( *SpatialEntity*, *SpatialEntity* ) | returns true p1 if is left above p2 (based on model m), else false. |
| mm:leftBelow( *SpatialEntity*, *SpatialEntity* ) | returns true p1 if is left below p2 (based on model m), else false. |
| mm:leftBeside( *SpatialEntity*, *SpatialEntity* ) | returns true p1 if is left beside p2 (based on model m), else false. |
| mm:rightAbove( *SpatialEntity*, *SpatialEntity* ) | returns true p1 if is right above p2 (based on model m), else false. |
| mm:rightBelow( *SpatialEntity*, *SpatialEntity* ) | returns true p1 if is right below p2 (based on model m), else false. |
| mm:rightBeside( *SpatialEntity*, *SpatialEntity* ) | returns true p1 if is right beside p2 (based on model m), else false. |
| mm:spatialContains( *SpatialEntity*, *SpatialEntity* ) | returns true if p1.shape contains p2.shape |
| mm:spatialDisjoint( *SpatialEntity*, *SpatialEntity* ) | returns true is p1.shape has no common points with p2.shape, else false. |
| mm:spatialEquals( *SpatialEntity*, *SpatialEntity* ) | returns true if p1.shape == p2.shape, else false. |
| mm:crosses( *SpatialEntity*, *SpatialEntity* ) | returns true if p1.shape and p2.shape have common points, else false. |
| mm:touches( *SpatialEntity*, *SpatialEntity* ) | returns true if p1.shape.edge has at least one common point with p2.shape.edge and p1.shape.interior has no common point with p2.shape.interior, else false. |

## Spatial Aggregations
| Relation name | Description |
| :------------ |:------------|
| mm:spatialBoundingBox( *SpatialEntity*, *SpatialEntity* ) | returns new MediaFragment / MediaFragmentURI with spatial fragment out of existing resources p1 and p2, so that x = min( p1.x, p2.x ) and y = min( p1.y, p2.y ) and w = max( p1.x + p1.w, p2.x + p2.w ) and h = max( p1.y + p1.h, p2.y + p2.h ). |
| mm:spatialIntersection( *SpatialEntity*, *SpatialEntity* ) | returns new MediaFragment / MediaFragmentURI with spatial fragment out of existing resources p1 and p2, so that x = max( p1.x, p2.x ) and y = max( p1.y, p2.y ) and w = min( p1.x + p1.w, p2.x + p2.w ) - max( p1.x, p2.x ) and h = min( p1.y + p1.h, p2.y + p2.h ) - max( p1.y, p1.x ) |

## Spatial Accessors
| Relation name | Description |
| :------------ |:------------|
| mm:getBoxArea( *SpatialEntity* ) | returns the area of BoundingBox of a shape, null if there is none. |
| mm:getBoxHeight( *SpatialEntity* ) | returns the height of a shape, null if there is none. |
| mm:isSpatialFragment( *SpatialEntity* ) | returns true is value is a spatial fragment. |
| mm:getBoxWidth( *SpatialEntity* ) | returns the width of a shape, null if there is none. |

## Temporal Relations
| Relation name | Description |
| :------------ |:------------|
| mm:overlappedBy( *TemporalEntity*, *TemporalEntity* ) | is the inverse function of overlaps. |
| mm:overlaps( *TemporalEntity*, *TemporalEntity* ) | returns true if p1.start < p2.start < p1.end < p2.end or p2.start < p.start < p.end < p.end, else false. |
| mm:precedes( *TemporalEntity*, *TemporalEntity* ) | returns true if p1.end < p2.start, else false. |
| mm:after( *TemporalEntity*, *TemporalEntity* ) | returns *true* if resource1.start >= resource2.end, else *false*. |
| mm:contains( *TemporalEntity*, *TemporalEntity* ) | returns true if p1.start < p2.start and p1.end > p2.end, else false. |
| mm:during( *TemporalEntity*, *TemporalEntity* ) | inverse function of contains. |
| mm:equals( *TemporalEntity*, *TemporalEntity* ) | returns true if p1.start == p2.start and p1.end == p2.end, else false. |
| mm:finishedBy( *TemporalEntity*, *TemporalEntity* ) | is the inverse function of finishes. |
| mm:finishes( *TemporalEntity*, *TemporalEntity* ) | returns true if p1.end == p2.end and p1.start > p1.start , else false. |
| mm:temporalMeets( *TemporalEntity*, *TemporalEntity* ) | returns true if resource1.start = resource2.end or resource1.end = resource2.start, else false. |
| mm:metBy( *TemporalEntity*, *TemporalEntity* ) | is the inverse function of meets. |
| mm:startedBy( *TemporalEntity*, *TemporalEntity* ) | is the inverse function of starts. |
| mm:starts( *TemporalEntity*, *TemporalEntity* ) | returns true if p1.start == p2.start and p1.end < p2.end , else false. |

## Temporal Aggregations
| Relation name | Description |
| :------------ |:------------|
| mm:temporalBoundingBox( *TemporalEntity*, *TemporalEntity* ) | returns new MediaFragment / MediaFragmentURI with temporal fragment ( Min( p1.start, p2.start ), Max( p1.end, p2.end ) ). |
| mm:temporalIntermediate( *TemporalEntity*, *TemporalEntity* ) | returns new MediaFragment / MediaFragmentURI with temporal fragment ( Min( p1.end, p2.end ), Max( p1.start, p2.start ) ) if intersection not exists, else null. |
| mm:temporalIntersection( *TemporalEntity*, *TemporalEntity* ) | returns new MediaFragmentURI with temporal fragment ( Max( resource1.start, resource2.start ), Min( resource1.end, resource2.end ) ) if intersection exists, else null. |

## Temporal Accessors
| Relation name | Description |
| :------------ |:------------|
| mm:getDuration( *TemporalEntity* ) | returns the duration of an interval, null if there is none. |
| mm:getEnd( *TemporalEntity* ) | returns the end of an interval, null if there is none. |
| mm:getStart( *TemporalEntity* ) | returns the start of an interval, null if there is none. |
| mm:isTemporalFragment( *TemporalEntity* ) | returns true is value is a temporal fragment. |

## Combined Aggregations
| Relation name | Description |
| :------------ |:------------|
| mm:boundingBox( *SpatialTemporalEntity*, *SpatialTemporalEntity* ) | returns new MediaFragment / MediaFragmentURI with spatial and temporal fragment. It it works like spatialFunction:boundingBox, temporalFunction:boundingBox or both together. |
| mm:intersection( *SpatialTemporalEntity*, *SpatialTemporalEntity* ) | returns new MediaFragment / MediaFragmentURI with spatial and temporal fragment. It works like spatialFunction:boundingBox, temporalFunction:intersection and both. |

## Other Accessors
| Relation name | Description |
| :------------ |:------------|
| mm:isMediaFragment( *URI* ) | returns if value is a MediaFragment |
| mm:isMediaFragmentURI( *URI* ) | returns if value is a MediaFragmentURI |

