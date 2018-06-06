package com.github.tkurz.sparqlmm.function.general.aggregation;

import com.github.tkurz.media.fragments.base.MediaFragment;
import com.github.tkurz.media.ontology.function.SpatialFunction;
import com.github.tkurz.media.ontology.function.TemporalFunction;
import com.github.tkurz.media.ontology.type.SpatialEntity;
import com.github.tkurz.media.ontology.type.SpatialTemporalEntity;
import com.github.tkurz.media.ontology.type.TemporalEntity;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.doc.FunctionDoc;
import com.github.tkurz.sparqlmm.utils.FunctionHelper;
import com.google.common.base.Joiner;
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
@FunctionDoc(title = "boundingBox", properties = {SpatialTemporalEntity.class,SpatialTemporalEntity.class}, reference = FunctionDoc.Reference.combined, description = "returns new MediaFragment / MediaFragmentURI with spatial and temporal fragment. It it works like spatialFunction:boundingBox, temporalFunction:boundingBox or both together.", type = FunctionDoc.Type.extensionAggregate)
public class BoundingBoxFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "boundingBox";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {

        //check preconditions
        if(values.length < 2 || !FunctionHelper.isComparable(values)) return null;

        String [] res = new String[2];

        try {
            SpatialEntity[] entities = FunctionHelper.toSpatialEntities(values);
            res[0] = SpatialFunction.getBoundingBox(entities).stringValue();
        } catch (IllegalArgumentException e){}

        try {
            TemporalEntity[] entities = FunctionHelper.toTemporalEntities(values);
            res[1] = TemporalFunction.getBoundingBox(entities).stringValue();
        } catch (IllegalArgumentException e){}


        if(values[0] instanceof URI) {
            String uri = FunctionHelper.getCleanURI(values[0]);
            return  valueFactory.createURI(uri + MediaFragment.DEFAULT_TYPE.getDelimiter() + Joiner.on("&").skipNulls().join(res));
        } else {
            //evaluate
            return valueFactory.createLiteral(Joiner.on("&").skipNulls().join(res));
        }
    }
}
