package be.verborgh.enterprise.inject;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.inject.Qualifier;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *
 * @author verborghs
 */
@Retention(RUNTIME)
@Target({FIELD, METHOD})
@Qualifier
public @interface ViewScope {
}
