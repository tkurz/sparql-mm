package com.github.tkurz.sparqlmm.spatial.relation.topological;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.FunctionException;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.sparqlmm.utils.FunctionDoc;
import com.google.common.base.Preconditions;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.spatial.SpatialFunctionHelper;
import org.openrdf.model.Literal;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.query.algebra.evaluation.ValueExprEvaluationException;
import org.openrdf.query.algebra.evaluation.function.Function;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
@FunctionDoc(title = "spatialIntersects", reference = FunctionDoc.Reference.spatial, description = "returns true if resource1.box has at least one common point with resource2.box, else false.")
public class IntersectsFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "spatialIntersects";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            Preconditions.checkArgument(values.length > 1 && values.length < 4, "Number of Arguments is not correct");

            //check if values are correct
            MediaFragmentURI[] uris = SpatialFunctionHelper.parseURIs(values[0],values[1]);

            if(values.length == 3) Preconditions.checkArgument(values[2] instanceof Literal);

            if (values.length == 3 && ((Literal)values[2]).booleanValue()) {
                return valueFactory.createLiteral(
                        uris[0].getMediaFragment().getSpatialFragment().intersects(uris[1].getMediaFragment().getSpatialFragment()));
            } else {
                return valueFactory.createLiteral(
                        !uris[0].getMediaFragment().getSpatialFragment().equal(uris[1].getMediaFragment().getSpatialFragment()) &&
                         uris[0].getMediaFragment().getSpatialFragment().intersects(uris[1].getMediaFragment().getSpatialFragment()));
            }

        } catch (MediaFragmentURISyntaxException e) {
            return valueFactory.createLiteral(false);
        } catch (FunctionException e) {
            return valueFactory.createLiteral(false);
        }

    }
}
