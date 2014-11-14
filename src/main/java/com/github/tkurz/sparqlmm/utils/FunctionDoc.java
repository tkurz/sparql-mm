package com.github.tkurz.sparqlmm.utils;

import com.github.tkurz.sparqlmm.vocabularies.SSD;
import org.openrdf.model.URI;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FunctionDoc {

    public static enum Type {
        extensionFunction(SSD.extensionFunction),
        extensionAggregate(SSD.extensionAggregate);

        private URI uri;

        Type(URI uri) {
            this.uri = uri;
        }

        public URI getUri() {
            return uri;
        }
    }

    /**
     * This provides the title when generating docs
     * @return
     */
    public String title();

    /**
     * This provides description when generating docs.
     * @return
     */
    public String description() default "";

    /**
     * This provides type when generating docs.
     * @return
     */
    public Type type() default Type.extensionFunction;

}