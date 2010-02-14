/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be.verborgh.enterprise.context;

import java.lang.annotation.Inherited;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Target;
import javax.enterprise.context.NormalScope;

/**
 *
 * @author verborghs
 */
@Target(value={METHOD,TYPE,FIELD})
@Retention(value=RUNTIME)
@NormalScope
@Inherited
public @interface FlashScoped {

}
