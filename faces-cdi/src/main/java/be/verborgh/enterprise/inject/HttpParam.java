/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be.verborgh.enterprise.inject;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Target;
import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;


/**
 *
 * @author verborghs
 */
@Qualifier
@Retention(RUNTIME)
@Target({TYPE, METHOD, FIELD, PARAMETER})
public @interface HttpParam {
  @Nonbinding public String value();
}
