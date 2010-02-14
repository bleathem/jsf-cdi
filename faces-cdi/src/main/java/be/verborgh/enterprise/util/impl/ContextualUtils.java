/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.verborgh.enterprise.util.impl;

import javax.enterprise.context.spi.Contextual;
import javax.enterprise.inject.spi.Bean;

/**
 *
 * @author verborghs
 */
public class ContextualUtils {

    public static <T> boolean isBean(Contextual<T> contextual) {
        if (contextual instanceof Bean) {
            return true;
        }
        return false;
    }
}
