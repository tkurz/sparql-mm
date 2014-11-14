package com.github.tkurz.sparqlmm.combined.function;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.FunctionException;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.media.fragments.spatial.SpatialFragment;
import com.github.tkurz.media.fragments.temporal.TemporalFragment;
import com.github.tkurz.media.fragments.utils.MediaFragments;
import com.github.tkurz.sparqlmm.combined.CombinedFunctionHelper;
import com.github.tkurz.sparqlmm.utils.FunctionDoc;
import com.google.common.base.Preconditions;
import com.github.tkurz.sparqlmm.Constants;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.query.algebra.evaluation.ValueExprEvaluationException;
import org.openrdf.query.algebra.evaluation.function.Function;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
@FunctionDoc(title = "boundingBox", reference = FunctionDoc.Reference.combined, description = "returns new MediaFragmentURI with spatial and temporal fragment. It it works like spatialFunction:boundingBox, temporalFunction:boundingBox or both together.", type = FunctionDoc.Type.extensionAggregate)
public class BoundingBoxFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "boundingBox";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            Preconditions.checkArgument(values.length == 2, "Number of Arguments is not correct");

            //check if values are correct
            MediaFragmentURI[] uris = CombinedFunctionHelper.parseURIs(values);

            //create box
            TemporalFragment temporal_fragment = null;
            if(MediaFragments.temporalComparable(uris)) {
                temporal_fragment = uris[0].getMediaFragment().getTemporalFragment().getBoundingBox(uris[1].getMediaFragment().getTemporalFragment());
            }

            SpatialFragment spatial_fragment = null;
            if(MediaFragments.spatialComparable(uris)) {
                spatial_fragment = uris[0].getMediaFragment().getSpatialFragment().getBoundingBox(uris[1].getMediaFragment().getSpatialFragment());
            }

            MediaFragmentURI uri = new MediaFragmentURI(uris[0].getAbsolutePath());

            //if no intersection
            if(temporal_fragment == null && spatial_fragment == null) return null;

            if(temporal_fragment != null) uri.getMediaFragment().setTemporalFragment(temporal_fragment);
            if(spatial_fragment != null) uri.getMediaFragment().setSpatialFragment(spatial_fragment);

            //evaluate
            return valueFactory.createURI(uri.toString());

        } catch (MediaFragmentURISyntaxException e) {
            return null;
        } catch (FunctionException e) {
            return null;
        }

    }
}
