/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be.verborgh.enterprise.inject.impl;

import be.verborgh.enterprise.inject.ViewScope;
import java.util.Map;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

/**
 *
 * @author verborghs
 */
public class ViewScopeProducer {
    @Produces
    @ViewScope
    public Map<String, Object> getViewScope(FacesContext fctx){
        return fctx.getViewRoot().getViewMap();
    }
}
