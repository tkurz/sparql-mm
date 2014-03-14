package com.github.tkurz.sparqlmm.spatial.relation.directional;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.FunctionException;
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
public class RightFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "right";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            Preconditions.checkArgument(values.length == 1, "Number of Arguments is not correct");

            //check if values are correct
            MediaFragmentURI[] uris = SpatialFunctionHelper.parseURIs(values);

            return valueFactory.createLiteral(uris[0].getMediaFragment().getSpatialFragment().right());

        } catch (MediaFragmentURISyntaxException e) {
            return valueFactory.createLiteral(false);
        } catch (FunctionException e) {
            return valueFactory.createLiteral(false);
        }

    }
}