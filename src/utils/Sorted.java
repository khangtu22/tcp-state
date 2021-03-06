package utils;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @overview 
 *  To annotate a <b>collection-typed</b> {@link Field} as being sorted, i.e. the elements of 
 *  a field's value are sorted.
 *   
 * @author dmle
 * 
 * @version 2017
 */
@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface Sorted {
  /** the sorting order */
  SortOrder order();
}
