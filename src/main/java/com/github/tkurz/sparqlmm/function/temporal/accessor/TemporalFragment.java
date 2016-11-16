package com.github.tkurz.sparqlmm.function.temporal.accessor;

/**
 * @author Thomas Kurz (tkurz@apache.org)
 * @since 16.11.16.
 */

import com.github.tkurz.media.ontology.type.SpatialEntity;
import com.github.tkurz.media.ontology.type.TemporalEntity;
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
@FunctionDoc(title = "TemporalFragment", properties = {TemporalEntity.class}, reference = FunctionDoc.Reference.temporal, description = "returns a string representation of a temporal fragment.", type = FunctionDoc.Type.accessorFunction)
public class TemporalFragment implements Function {
    @Override
    public String getURI() {
        return Constants.NAMESPACE + "temporalFragment";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        if(values.length == 1) {
            try {
                return valueFactory.createLiteral(FunctionHelper.toTemporalEntity(values[0]).stringValue()); //TODO check
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
