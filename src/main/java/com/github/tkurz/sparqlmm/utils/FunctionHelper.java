package com.github.tkurz.sparqlmm.utils;

import com.github.tkurz.media.fragments.ParseException;
import com.github.tkurz.media.fragments.base.MediaFragment;
import com.github.tkurz.media.fragments.base.MediaFragmentURI;
import com.github.tkurz.media.fragments.exceptions.MediaFragmentURISyntaxException;
import com.github.tkurz.media.ontology.type.SpatialEntity;
import com.github.tkurz.media.ontology.type.SpatialTemporalEntity;
import com.github.tkurz.media.ontology.type.TemporalEntity;
import org.openrdf.model.Literal;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
public class FunctionHelper {

    public static final Literal BOOL_LITERAL_FALSE = ValueFactoryImpl.getInstance().createLiteral(false);
    public static final Literal BOOL_LITERAL_TRUE = ValueFactoryImpl.getInstance().createLiteral(true);

    public static TemporalEntity toTemporalEntity(Value v) {
        if(v instanceof URI) {
            //try to parse media fragment from uri
            try {
                MediaFragmentURI uri = new MediaFragmentURI(v.stringValue());
                return uri.getMediaFragment().hasTemporalFragment() ? uri.getMediaFragment().getTemporalFragment() : null;
            } catch (MediaFragmentURISyntaxException e) {
                return null;
            }
        } else if(v instanceof Literal) {
            //try to parse simple fragment TODO add object parsing
            try {
                MediaFragment fragment = MediaFragment.create(v.stringValue());
                return fragment.hasTemporalFragment() ? fragment.getTemporalFragment() : null;
            } catch (com.github.tkurz.media.fragments.ParseException e) {
                return null;
            }
        }
        return null;
    }

    public static SpatialEntity[] toSpatialEntities(Value... values) {
        SpatialEntity[] entities = new SpatialEntity[values.length];

        for(int i = 0; i < values.length; i++) {
            SpatialEntity entity = toSpatialEntity(values[i]);

            if(entity == null) throw new IllegalArgumentException();

            entities[i] = entity;
        }

        return entities;
    }

    public static SpatialEntity toSpatialEntity(Value v) {
        if(v instanceof URI) {
            //try to parse media fragment from uri
            try {
                MediaFragmentURI uri = new MediaFragmentURI(v.stringValue());
                return uri.getMediaFragment().hasSpatialFragment() ? uri.getMediaFragment().getSpatialFragment() : null;
            } catch (MediaFragmentURISyntaxException e) {
                return null;
            }
        } else if(v instanceof Literal) {
            //try to parse simple fragment TODO add object parsing
            try {
                MediaFragment fragment = MediaFragment.create(v.stringValue());
                return fragment.hasSpatialFragment() ? fragment.getSpatialFragment() : null;
            } catch (com.github.tkurz.media.fragments.ParseException e) {
                return null;
            }
        }
        return null;
    }

    public static MediaFragmentURI toMediaFragmentURI(Value v) {
        if(v instanceof URI) {
            //try to parse media fragment from uri
            try {
                return new MediaFragmentURI(v.stringValue());
            } catch (MediaFragmentURISyntaxException e) {
                return null;
            }
        }
        return null;
    }

    public static MediaFragment toMediaFragment(Value v) {
        if(v instanceof URI) {
            //try to parse media fragment from uri
            try {
                return new MediaFragmentURI(v.stringValue()).getMediaFragment();
            } catch (MediaFragmentURISyntaxException e) {
                return null;
            }
        }
        return null;
    }

    public static SpatialTemporalEntity toSpatialTemporalEntity(Value v) {
        if(v instanceof URI) {
            //try to parse media fragment from uri
            try {
                MediaFragmentURI uri = new MediaFragmentURI(v.stringValue());
                return uri.getMediaFragment() != null ? uri.getMediaFragment() : null;
            } catch (MediaFragmentURISyntaxException e) {
                return null;
            }
        } else if(v instanceof Literal) {
            //try to parse simple fragment TODO add object parsing
            try {
                return MediaFragment.create(v.stringValue());
            } catch (com.github.tkurz.media.fragments.ParseException e) {
                return null;
            }
        }
        return null;
    }

    public static TemporalEntity[] toTemporalEntities(Value... values) {
        TemporalEntity[] entities = new TemporalEntity[values.length];

        for(int i = 0; i < values.length; i++) {
            TemporalEntity entity = toTemporalEntity(values[i]);

            if(entity == null) throw new IllegalArgumentException();

            entities[i] = entity;
        }

        return entities;
    }

    public static boolean isMediaFragmentURI(Value value) {
        if(value instanceof URI) {
            try {
                new MediaFragmentURI(value.stringValue());
                return true;
            } catch (MediaFragmentURISyntaxException e) {
                return false;
            }
        }
        return false;
    }

    public static boolean isMediaFragment(Value value) {
        if(value instanceof URI) {
            return false;
        }
        try {
            MediaFragment.create(value.stringValue());
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isComparable(Value... values) {
        Class<? extends Value> clazz = null;
        String baseURI = null;
        for(Value v : values) {
            if(clazz == null) {
                clazz = v.getClass();
                baseURI = getCleanURI(v);
            } else if(v.getClass().equals(clazz)) {
                if(v instanceof URI) {
                    if(!baseURI.equals(getCleanURI(v))) {
                        return false;
                    }
                }
            } else return false;
        }
        return true;
    }

    public static String getCleanURI(Value v) {
        return v.stringValue().replaceAll("\\?.*","").replaceAll("#.*","");
    }

}
