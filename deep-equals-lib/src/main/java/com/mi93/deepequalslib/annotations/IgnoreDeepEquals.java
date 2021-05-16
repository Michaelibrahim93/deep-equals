package com.mi93.deepequalslib.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * if field has @IgnoreDeepEquals annotation this field will be ignored if deepEquals is been called
 *
 * @author  Michael Ibrahim
 * @version 1.0
 * @since   2021-5-15
 * */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreDeepEquals {
}
