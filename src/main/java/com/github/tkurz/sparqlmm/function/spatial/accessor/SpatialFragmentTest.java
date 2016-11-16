package com.github.tkurz.sparqlmm.function.spatial.accessor;

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
@FunctionDoc(title = "SpatialFragment Test", properties = {SpatialEntity.class}, reference = FunctionDoc.Reference.spatial, description = "returns true is value is or includes a spatial fragment.", type = FunctionDoc.Type.accessorFunction)
public class SpatialFragmentTest implements Function {
    @Override
    public String getURI() {
        return Constants.NAMESPACE + "hasSpatialFragment";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        if(values.length != 1) return FunctionHelper.BOOL_LITERAL_FALSE;
        try {
            return FunctionHelper.toSpatialEntity(values[0]) == null ?
                    FunctionHelper.BOOL_LITERAL_FALSE :
                    FunctionHelper.BOOL_LITERAL_TRUE;
        } catch (IllegalArgumentException e) {
            return FunctionHelper.BOOL_LITERAL_FALSE;
        }
    }
}
