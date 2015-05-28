package com.github.tkurz.sparqlmm;

import com.github.tkurz.sparqlmm.utils.FunctionHelper;
import org.junit.Assert;
import org.junit.Test;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
public class HelperTests {

    @Test
    public void testUriComparator() {

        ValueFactory factory = ValueFactoryImpl.getInstance();

        Value v0 = factory.createLiteral("456");
        Value v1 = factory.createLiteral("123");
        Value v2 = factory.createLiteral("312");
        Value v3 = factory.createURI("http://example.org/123#t=1,2");
        Value v4 = factory.createURI("http://example.org/321#t=1,2");
        Value v5 = factory.createURI("http://example.org/321#t=3,4");
        Value v6 = factory.createURI("http://example.org/321#t=4,5");

        Assert.assertTrue(FunctionHelper.isComparable(v1,v2));
        Assert.assertTrue(FunctionHelper.isComparable(v0,v1,v2));
        Assert.assertTrue(FunctionHelper.isComparable(v4,v5));
        Assert.assertTrue(FunctionHelper.isComparable(v4,v5,v6));

        Assert.assertFalse(FunctionHelper.isComparable(v3, v4));
        Assert.assertFalse(FunctionHelper.isComparable(v1, v5));

    }

}
