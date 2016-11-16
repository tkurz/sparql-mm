package com.github.tkurz.sparqlmm.function.temporal.aggregation;

import com.github.tkurz.media.ontology.exception.NotAggregatableException;
import com.github.tkurz.media.ontology.function.TemporalFunction;
import com.github.tkurz.media.ontology.type.TemporalEntity;
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
@FunctionDoc(title = "temporal Intermediate", properties = {TemporalEntity.class, TemporalEntity.class}, reference = FunctionDoc.Reference.temporal, description = "returns new MediaFragment / MediaFragmentURI with temporal fragment ( Min( p1.end, p2.end ), Max( p1.start, p2.start ) ) if intersection not exists, else null.", type = FunctionDoc.Type.extensionAggregate)
public class IntermediateFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "temporalIntermediate";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            //check preconditions
            if(values.length != 2 || !FunctionHelper.isComparable(values)) return null;

            //check if values are correct
            TemporalEntity[] entities = FunctionHelper.toTemporalEntities(values);

            //evaluate
            String box = TemporalFunction.getIntermediate(entities[0],entities[1]).stringValue();

            if(values[0] instanceof URI) {
                String uri = FunctionHelper.getCleanURI(values[0]);
                return  valueFactory.createURI(uri + "#" + box);
            } else {
                //evaluate
                return valueFactory.createLiteral(box);
            }

        } catch (IllegalArgumentException | NotAggregatableException e) {
            return null;
        }
    }
}
