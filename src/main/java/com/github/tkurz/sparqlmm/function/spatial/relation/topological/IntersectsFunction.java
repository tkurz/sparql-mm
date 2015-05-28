package com.github.tkurz.sparqlmm.function.spatial.relation.topological;

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
@FunctionDoc(title = "Intersects", properties = {SpatialEntity.class, SpatialEntity.class}, reference = FunctionDoc.Reference.spatial, description = "returns true if p1 has at least one common point with p2, else false.")
public class IntersectsFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "intersects";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            //check preconditions
            if(values.length != 2 || !FunctionHelper.isComparable(values)) return FunctionHelper.BOOL_LITERAL_FALSE;


            //check if values are correct
            SpatialEntity[] entities = FunctionHelper.toSpatialEntities(values);

            //evaluate
            return valueFactory.createLiteral(SpatialFunction.TopologicalFunction.intersects(entities[0], entities[1]));

        } catch (IllegalArgumentException e) {
            return FunctionHelper.BOOL_LITERAL_FALSE;
        }
    }
}
