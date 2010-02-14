/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be.verborgh.enterprise.inject.impl;

import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

/**
 *
 * @author verborghs
 */
public class FacesContextProducer {

    @Produces
    public FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }
}
