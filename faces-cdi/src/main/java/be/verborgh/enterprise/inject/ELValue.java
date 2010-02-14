/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be.verborgh.enterprise.inject;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
/**
 *
 * @author verborghs
 */
@Retention(RUNTIME)
@Target({FIELD, METHOD})
@Qualifier
public @interface ELValue {
    @Nonbinding public String value();
}
