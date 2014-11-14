package com.github.tkurz.sparqlmm.temporal.function;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.media.fragments.temporal.TemporalFragment;
import com.github.tkurz.sparqlmm.utils.FunctionDoc;
import com.google.common.base.Preconditions;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.temporal.TemporalFunctionHelper;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.query.algebra.evaluation.ValueExprEvaluationException;
import org.openrdf.query.algebra.evaluation.function.Function;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
@FunctionDoc(title = "temporalIntermediate", reference = FunctionDoc.Reference.temporal, description = "returns new MediaFragmentURI with temporal fragment ( Min( resource1.end, resource2.end ), Max( resource1.start, resource2.start ) ) if intersection not exists, else null.", type = FunctionDoc.Type.extensionAggregate)
public class IntermediateFunction implements Function {

    /**
     * return the URI
     */
    public String getURI() {
        return Constants.NAMESPACE + "temporalIntermediate";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        try {
            Preconditions.checkArgument(values.length == 2, "Number of Arguments is not correct");

            //check if values are correct
            MediaFragmentURI[] uris = TemporalFunctionHelper.parseURIs(values);

            //create intersection
            TemporalFragment fragment = uris[0].getMediaFragment().getTemporalFragment().getIntermediate(uris[1].getMediaFragment().getTemporalFragment());

            //if no intersection
            if(fragment == null) return null;

            MediaFragmentURI uri = new MediaFragmentURI(uris[0].getAbsolutePath());
            uri.getMediaFragment().setTemporalFragment(fragment);

            //evaluate
            return valueFactory.createURI(uri.toString());

        } catch (MediaFragmentURISyntaxException e) {
            return null;
        }

    }
}
