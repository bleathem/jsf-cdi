/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be.verborgh.enterprise.inject.impl;

import javax.enterprise.inject.Produces;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author verborghs
 */
public class RequestProducer {

    @Produces
    public HttpServletRequest getRequest(ExternalContext ectx) {
        return (HttpServletRequest) ectx.getRequest();
    }
}
