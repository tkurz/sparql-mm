package com.github.tkurz.sparqlmm.function.spatial.relation.directional;

import com.github.tkurz.media.ontology.function.SpatialFunction;
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
@FunctionDoc(title = "above", properties = {SpatialEntity.class, SpatialEntity.class}, reference = FunctionDoc.Reference.spatial, description = "returns true p1 if is above p2 (based on model m), else false.")
public class AboveFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "above";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            //check preconditions
            if(values.length != 2 || !FunctionHelper.isComparable(values)) return FunctionHelper.BOOL_LITERAL_FALSE;


            //check if values are correct
            SpatialEntity[] entities = FunctionHelper.toSpatialEntities(values);

            //evaluate
            return valueFactory.createLiteral(SpatialFunction.DirectionalFunction.above(entities[0], entities[1]));

        } catch (IllegalArgumentException e) {
            return FunctionHelper.BOOL_LITERAL_FALSE;
        }
    }
}