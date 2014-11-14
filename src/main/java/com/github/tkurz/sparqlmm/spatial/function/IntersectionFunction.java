package com.github.tkurz.sparqlmm.spatial.function;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.FunctionException;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.media.fragments.spatial.SpatialFragment;
import com.github.tkurz.sparqlmm.spatial.SpatialFunctionHelper;
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
@FunctionDoc(title = "spatialIntersection", reference = FunctionDoc.Reference.spatial, description = "returns new MediaFragmentURI with spatial fragment out of existing resources A and B, so that x = max( A.x, B.x ) and y = max( A.y, B.y ) and w = min( A.x + A.w, B.x + B.w ) - max( A.x, B.x ) and h = min( A.y + A.h, B.y + B.h ) - max( A.y, A.x )", type = FunctionDoc.Type.extensionAggregate)
public class IntersectionFunction implements Function {
    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "spatialIntersection";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            Preconditions.checkArgument(values.length == 2, "Number of Arguments is not correct");

            //check if values are correct
            MediaFragmentURI[] uris = SpatialFunctionHelper.parseURIs(values);

            //create intersection
            SpatialFragment fragment = uris[0].getMediaFragment().getSpatialFragment().getIntersection(uris[1].getMediaFragment().getSpatialFragment());

            //if no intersection
            if(fragment == null) return null;

            MediaFragmentURI uri = new MediaFragmentURI(uris[0].getAbsolutePath());
            uri.getMediaFragment().setSpatialFragment(fragment);

            //evaluate
            return valueFactory.createURI(uri.toString());

        } catch (MediaFragmentURISyntaxException e) {
            return null;
        } catch (FunctionException e) {
            return null;
        }
    }
}
