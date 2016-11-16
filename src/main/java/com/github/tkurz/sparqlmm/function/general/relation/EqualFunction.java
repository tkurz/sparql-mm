package com.github.tkurz.sparqlmm.function.general.relation;

import com.github.tkurz.media.ontology.exception.NotComparableException;
import com.github.tkurz.media.ontology.function.SpatialFunction;
import com.github.tkurz.media.ontology.function.TemporalFunction;
import com.github.tkurz.media.ontology.type.SpatialEntity;
import com.github.tkurz.media.ontology.type.SpatialTemporalEntity;
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
@FunctionDoc(title = "equals", properties = {SpatialTemporalEntity.class, SpatialTemporalEntity.class}, reference = FunctionDoc.Reference.combined, description = "returns if mm:temporalEquals(p1,p2) and mm:spatialEquals(p1,p2).")
public class EqualFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "equals";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            //check preconditions
            if (values.length != 2 || !FunctionHelper.isComparable(values)) return FunctionHelper.BOOL_LITERAL_FALSE;

            //check if values are correct
            TemporalEntity[] temporalEntities = FunctionHelper.toTemporalEntities(values);

            SpatialEntity[] spatialEntities = FunctionHelper.toSpatialEntities(values);

            //evaluate
            if (TemporalFunction.equals(temporalEntities[0], temporalEntities[1]) && SpatialFunction.TopologicalFunction.equals(spatialEntities[0], spatialEntities[0])) {
                return FunctionHelper.BOOL_LITERAL_TRUE;
            }

            return FunctionHelper.BOOL_LITERAL_FALSE;

        } catch (IllegalArgumentException | NotComparableException e) {
            return FunctionHelper.BOOL_LITERAL_FALSE;
        }
    }
}