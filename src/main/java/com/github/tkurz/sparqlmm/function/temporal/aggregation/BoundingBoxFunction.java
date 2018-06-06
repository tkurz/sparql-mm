package com.github.tkurz.sparqlmm.function.temporal.aggregation;

import com.github.tkurz.media.fragments.base.MediaFragment;
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
@FunctionDoc(title = "temporalBoundingBox", properties = {TemporalEntity.class, TemporalEntity.class}, reference = FunctionDoc.Reference.temporal, description = "returns new MediaFragment / MediaFragmentURI with temporal fragment ( Min( p1.start, p2.start ), Max( p1.end, p2.end ) ).", type = FunctionDoc.Type.extensionAggregate)
public class BoundingBoxFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "temporalBoundingBox";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            //check preconditions
            if(values.length < 2 || !FunctionHelper.isComparable(values)) return null;

            //check if values are correct
            TemporalEntity[] entities = FunctionHelper.toTemporalEntities(values);

            //evaluate
            String box = TemporalFunction.getBoundingBox(entities).stringValue();

            if(values[0] instanceof URI) {
                String uri = FunctionHelper.getCleanURI(values[0]);
                return  valueFactory.createURI(uri + MediaFragment.DEFAULT_TYPE.getDelimiter() + box);
            } else {
                //evaluate
                return valueFactory.createLiteral(box);
            }

        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
