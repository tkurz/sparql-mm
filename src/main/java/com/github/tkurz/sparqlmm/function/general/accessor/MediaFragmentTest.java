package com.github.tkurz.sparqlmm.function.general.accessor;

import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.doc.FunctionDoc;
import com.github.tkurz.sparqlmm.utils.FunctionHelper;
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
@FunctionDoc(title = "MediaFragment Test", properties = {URI.class}, reference = FunctionDoc.Reference.other, description = "returns if value is a MediaFragment", type = FunctionDoc.Type.accessorFunction)
public class MediaFragmentTest implements Function {

    @Override
    public String getURI() {
        return Constants.NAMESPACE + "isMediaFragment";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        if(values.length != 1) return null;
        try {
            return FunctionHelper.isMediaFragment(values[0]) ? FunctionHelper.BOOL_LITERAL_TRUE : FunctionHelper.BOOL_LITERAL_FALSE;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}