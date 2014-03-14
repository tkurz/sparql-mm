package com.github.tkurz.sparqlmm.combined.function;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.FunctionException;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.media.fragments.spatial.SpatialFragment;
import com.github.tkurz.media.fragments.temporal.TemporalFragment;
import com.github.tkurz.sparqlmm.combined.CombinedFunctionHelper;
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
public class IntersectionFunction implements Function {
    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "intersection";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            Preconditions.checkArgument(values.length == 2, "Number of Arguments is not correct");

            //check if values are correct

            MediaFragmentURI[] uris = CombinedFunctionHelper.parseURIs(values);

            //create intersection
            SpatialFragment spatial_fragment = uris[0].getMediaFragment().getSpatialFragment().getIntersection(uris[1].getMediaFragment().getSpatialFragment());
            TemporalFragment temporal_fragment = uris[0].getMediaFragment().getTemporalFragment().getIntersection(uris[1].getMediaFragment().getTemporalFragment());


            //if no intersection
            if(spatial_fragment == null || temporal_fragment == null) return null;

            MediaFragmentURI uri = new MediaFragmentURI(uris[0].getAbsolutePath());
            uri.getMediaFragment().setTemporalFragment(temporal_fragment);
            uri.getMediaFragment().setSpatialFragment(spatial_fragment);

            //evaluate
            return valueFactory.createURI(uri.toString());

        } catch (MediaFragmentURISyntaxException e) {
            return null;
        } catch (FunctionException e) {
            return null;
        }
    }
}
