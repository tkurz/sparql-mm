package com.github.tkurz.sparqlmm.function.accessor;

import com.github.tkurz.media.ontology.type.TemporalEntity;
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
@FunctionDoc(title = "Start Accessor", properties = {TemporalEntity.class}, reference = FunctionDoc.Reference.temporal, description = "returns the start of an interval, null if there is none.", type = FunctionDoc.Type.accessorFunction)
public class StartAccessor implements Function {

    @Override
    public String getURI() {
        return Constants.NAMESPACE + "getStart";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        if(values.length != 1) return null;
        try {
            TemporalEntity e = FunctionHelper.toTemporalEntity(values[0]);

            if(e == null) return null;

            return valueFactory.createLiteral(e.getStart().getValue());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
