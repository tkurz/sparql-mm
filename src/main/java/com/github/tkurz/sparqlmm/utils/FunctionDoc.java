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

    public static enum Reference {
        spatial, temporal, combined;

        public String getName() {
            return Character.toString(this.name().charAt(0)).toUpperCase()+this.name().substring(1);
        }
    }

    public static enum Type {
        extensionFunction("Relation", SSD.extensionFunction),
        extensionAggregate("Aggregation", SSD.extensionAggregate);

        private URI uri;
        private String name;

        Type(String name, URI uri) {
            this.name = name;
            this.uri = uri;
        }

        public URI getUri() {
            return uri;
        }

        public String getName() {
            return name;
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

    /**
     * provides
     * @return
     */
    public Reference reference();

}