package com.github.tkurz.sparqlmm.function.spatial.aggregation;

import com.github.tkurz.media.ontology.function.SpatialFunction;
import com.github.tkurz.media.ontology.type.SpatialEntity;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.doc.FunctionDoc;
import com.github.tkurz.sparqlmm.utils.FunctionHelper;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.query.algebra.evaluation.ValueExprEvaluationException;
import org.openrdf.query.algebra.evaluation.function.Function;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
@FunctionDoc(title = "spatialBoundingBox", properties = {SpatialEntity.class, SpatialEntity.class}, reference = FunctionDoc.Reference.spatial, description = "returns new MediaFragment / MediaFragmentURI with spatial fragment out of existing resources p1 and p2, so that x = min( p1.x, p2.x ) and y = min( p1.y, p2.y ) and w = max( p1.x + p1.w, p2.x + p2.w ) and h = max( p1.y + p1.h, p2.y + p2.h ).", type = FunctionDoc.Type.extensionAggregate)
public class BoundingBoxFunction implements Function {
    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "spatialBoundingBox";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            //check preconditions
            if(values.length < 2 || !FunctionHelper.isComparable(values)) return null;

            //check if values are correct
            SpatialEntity[] entities = FunctionHelper.toSpatialEntities(values);

            //evaluate
            String box = SpatialFunction.getBoundingBox(entities).stringValue();

            if(values[0] instanceof URI) {
                String uri = FunctionHelper.getCleanURI(values[0]);
                return  valueFactory.createURI(uri + "#" + box);
            } else {
                //evaluate
                return valueFactory.createLiteral(box);
            }

        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
