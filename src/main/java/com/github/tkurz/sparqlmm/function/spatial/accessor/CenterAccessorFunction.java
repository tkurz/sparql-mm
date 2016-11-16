package com.github.tkurz.sparqlmm.function.spatial.accessor;

/**
 * @author Thomas Kurz (tkurz@apache.org)
 * @since 16.11.16.
 */

import com.github.tkurz.media.ontology.type.SpatialEntity;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.doc.FunctionDoc;
import com.github.tkurz.sparqlmm.utils.FunctionHelper;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.query.algebra.evaluation.ValueExprEvaluationException;
import org.openrdf.query.algebra.evaluation.function.Function;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
@FunctionDoc(title = "Center Accessor", properties = {SpatialEntity.class}, reference = FunctionDoc.Reference.spatial, description = "returns the center of a BoundingBox of a shape, null if there is none.", type = FunctionDoc.Type.accessorFunction)
public class CenterAccessorFunction implements Function {

    @Override
    public String getURI() {
        return Constants.NAMESPACE + "center";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        if(values.length != 1) return null;
        try {
            SpatialEntity e = FunctionHelper.toSpatialEntity(values[0]);

            if(e == null) return null;

            return valueFactory.createLiteral(e.getCenter().stringValue());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}