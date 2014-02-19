package com.github.tkurz.sparqlmm.temporal.relation;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.google.common.base.Preconditions;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.temporal.TemporalFunctionHelper;
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
public class OverlapsFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE_TEMPORAL + "overlaps";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            Preconditions.checkArgument(values.length > 1 && values.length < 4, "Number of Arguments is not correct");

            //check if values are correct
            MediaFragmentURI[] uris = TemporalFunctionHelper.parseURIs(values[0],values[1]);

            if(values.length == 3) Preconditions.checkArgument(values[2] instanceof Literal);

            if (values.length == 3 && ((Literal)values[2]).booleanValue()) {
                return valueFactory.createLiteral(
                        uris[0].getMediaFragment().getTemporalFragment().overlaps(uris[1].getMediaFragment().getTemporalFragment()));
            } else {
                return valueFactory.createLiteral(
                        !uris[0].getMediaFragment().getTemporalFragment().equal(uris[1].getMediaFragment().getTemporalFragment()) &&
                                uris[0].getMediaFragment().getTemporalFragment().overlaps(uris[1].getMediaFragment().getTemporalFragment()));
            }

        } catch (MediaFragmentURISyntaxException e) {
            return valueFactory.createLiteral(false);
        }

    }
}
