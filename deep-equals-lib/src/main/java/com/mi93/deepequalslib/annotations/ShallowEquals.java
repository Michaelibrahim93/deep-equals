package com.mi93.deepequalslib.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * if field has @ShallowEquals annotation this field will be checked using equals method not deepEquals
 *
 * @author  Michael Ibrahim
 * @version 1.0
 * @since   2021-5-15
 * */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ShallowEquals {
}
