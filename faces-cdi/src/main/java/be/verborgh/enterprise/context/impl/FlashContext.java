/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be.verborgh.enterprise.context.impl;

import be.verborgh.enterprise.util.impl.ContextualUtils;
import be.verborgh.enterprise.context.FlashScoped;
import java.lang.annotation.Annotation;
import javax.enterprise.context.spi.Context;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;

/**
 *
 * @author verborghs
 */
public class FlashContext implements Context {

    private Flash getFlash() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext externalContext = fctx.getExternalContext();
        return externalContext.getFlash();
    }

    public Class<? extends Annotation> getScope() {
        return FlashScoped.class;
    }

    public <T> T get(Contextual<T> contextual, CreationalContext<T> creationalContext) {
        T t = get(contextual);
        if (t == null) {
            t = create(contextual, creationalContext);
        }
        return t;
    }

    public <T> T get(Contextual<T> contextual) {
        if (!ContextualUtils.isBean(contextual)) {
            throw new IllegalArgumentException();
        } else {
            Bean<T> bean = (Bean<T>) contextual;
            return (T) getFlash().get(bean.getName());
        }
    }

    public boolean isActive() {
        return true;
    }

    private <T> T create(Contextual<T> contextual, CreationalContext<T> creationalContext) {
        Bean<T> bean = (Bean<T>) contextual;
        T t = bean.create(creationalContext);
        getFlash().put(bean.getName(), t);
        return t;
    }
}
