package com.github.tkurz.sparqlmm.function.general.accessor;

import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.ontology.type.SpatialTemporalEntity;
import com.github.tkurz.sparqlmm.Constants;
import com.github.tkurz.sparqlmm.doc.FunctionDoc;
import com.github.tkurz.sparqlmm.utils.FunctionHelper;
import org.openrdf.model.Literal;
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
@FunctionDoc(title = "toPixel Transformer", properties = {SpatialTemporalEntity.class,Double.class}, reference = FunctionDoc.Reference.combined, description = "returns a string representation of a media fragment (uri) transformed to pixel using a double parameter.", type = FunctionDoc.Type.accessorFunction)
public class ToPixelTransformer implements Function {
    @Override
    public String getURI() {
        return Constants.NAMESPACE + "toPixel";
    }

    @Override
    public Value evaluate(ValueFactory valueFactory, Value... values) throws ValueExprEvaluationException {
        if(values.length == 2) {
            if(values[0] instanceof URI && values[1] instanceof Literal) {
                try {
                    MediaFragmentURI uri = FunctionHelper.toMediaFragmentURI(values[0]);
                    double c = Double.parseDouble(values[1].stringValue());
                    if (uri != null) {
                        return valueFactory.createURI(uri.toPixel(c).stringValue());
                    } else {
                        return null;
                    }
                } catch (Exception e) {
                    return null;
                }
            }

            if(values[0] instanceof Literal && values[1] instanceof Literal) {
                try {
                    com.github.tkurz.media.fragments.base.MediaFragment entity = FunctionHelper.toMediaFragment(values[0]);
                    double c = Double.parseDouble(values[1].stringValue());
                    if (entity != null) {
                        return valueFactory.createURI(entity.toPixel(c).stringValue());
                    }
                } catch (Exception e) {
                    return null;
                }
            }
        }

        return null;
    }
}
