package com.github.tkurz.sparqlmm.doc;

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

    enum Reference {
        spatial("Spatial"), temporal("Temporal"), combined("General"), other("Other");

        private String value;

        Reference(String value) {
            this.value = value;
        }

        public String getName() {
            return value;
        }
    }

    enum Type {
        extensionFunction("R", "Relation", SSD.extensionFunction),
        extensionAggregate("A", "Aggregation", SSD.extensionAggregate),
        accessorFunction("F", "Accessor", SSD.extensionFunction);

        private URI uri;
        private String name;
        private String id;

        Type(String id, String name, URI uri) {
            this.name = name;
            this.uri = uri;
            this.id = id;
        }

        public URI getUri() {
            return uri;
        }

        public String getName() {
            return name;
        }

        public String getId() { return id; }
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

    public Class[] properties();

}