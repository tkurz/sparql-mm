package com.github.tkurz.sparqlmm.spatial.relation.topological;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.google.common.base.Preconditions;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.spatial.SpatialFunctionHelper;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.query.algebra.evaluation.ValueExprEvaluationException;
import org.openrdf.query.algebra.evaluation.function.Function;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
public class TouchesFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE_SPATIAL + "touches";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            Preconditions.checkArgument(values.length == 2, "Number of Arguments is not correct");

            //check if values are correct
            MediaFragmentURI[] uris = SpatialFunctionHelper.parseURIs(values);

            return valueFactory.createLiteral(
                    uris[0].getMediaFragment().getSpatialFragment().touches(uris[1].getMediaFragment().getSpatialFragment()));

        } catch (MediaFragmentURISyntaxException e) {
            return valueFactory.createLiteral(false);
        }

    }
}
