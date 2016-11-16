package com.github.tkurz.sparqlmm.function.spatial.accessor;

import com.github.tkurz.media.ontology.type.SpatialEntity;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.doc.FunctionDoc;
import com.github.tkurz.sparqlmm.utils.FunctionHelper;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.query.algebra.evaluation.ValueExprEvaluationException;
import org.openrdf.query.algebra.evaluation.function.Function;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
@FunctionDoc(title = "SpatialFragment", properties = {SpatialEntity.class}, reference = FunctionDoc.Reference.spatial, description = "returns a string representation of a spatial fragment.", type = FunctionDoc.Type.accessorFunction)
public class SpatialFragment implements Function {
    @Override
    public String getURI() {
        return Constants.NAMESPACE + "spatialFragment";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        if(values.length == 1) {
            try {
                return valueFactory.createLiteral(FunctionHelper.toSpatialEntity(values[0]).stringValue()); //TODO check
            } catch (IllegalArgumentException | NullPointerException e) {
                return null;
            }
        } else if(values.length == 2) {
            //TODO implement specific to string parameters
            throw new NotImplementedException();
        }

        return null;
    }
}
