package utils;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target({ METHOD, CONSTRUCTOR })
/**
 * @overview 
 *  Annotate a method or constructor as a domain operation.
 *  
 * @author dmle
 *
 * @version 2017 
 */
public @interface DOpt {

  /**
   *  The operation type 
   */
  OptType type();

}
