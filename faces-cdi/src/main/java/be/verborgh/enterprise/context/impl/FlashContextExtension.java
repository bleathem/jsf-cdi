/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.verborgh.enterprise.context.impl;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;

/**
 *
 * @author verborghs
 */
public class FlashContextExtension implements Extension{

    public void afterBeanDiscovery(@Observes AfterBeanDiscovery event, BeanManager manager) {
        event.addContext(new FlashContext());
    }
}
