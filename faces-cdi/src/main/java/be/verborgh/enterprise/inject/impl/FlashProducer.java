/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be.verborgh.enterprise.inject.impl;

import javax.enterprise.inject.Produces;
import javax.faces.context.ExternalContext;
import javax.faces.context.Flash;

/**
 *
 * @author verborghs
 */
public class FlashProducer {
    @Produces
    public Flash getFlash(ExternalContext ectx) {
        return ectx.getFlash();
    }
}
