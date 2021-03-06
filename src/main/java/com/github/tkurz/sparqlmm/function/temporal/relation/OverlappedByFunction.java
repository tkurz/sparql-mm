package com.github.tkurz.sparqlmm.function.temporal.relation;

import com.github.tkurz.media.ontology.exception.NotComparableException;
import com.github.tkurz.media.ontology.function.TemporalFunction;
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
@FunctionDoc(title = "Overlapped by", properties = {TemporalEntity.class, TemporalEntity.class}, reference = FunctionDoc.Reference.temporal, description = "is the inverse function of overlaps.")
public class OverlappedByFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "overlappedBy";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            //check preconditions
            if(values.length != 2 || !FunctionHelper.isComparable(values)) return FunctionHelper.BOOL_LITERAL_FALSE;


            //check if values are correct
            TemporalEntity[] entities = FunctionHelper.toTemporalEntities(values);

            //evaluate
            return valueFactory.createLiteral(TemporalFunction.overlappedBy(entities[0], entities[1]));

        } catch (IllegalArgumentException | NotComparableException e) {
            return FunctionHelper.BOOL_LITERAL_FALSE;
        }
    }
}
