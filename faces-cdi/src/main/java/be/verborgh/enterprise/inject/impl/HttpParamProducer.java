/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.verborgh.enterprise.inject.impl;

import be.verborgh.enterprise.inject.HttpParam;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author verborghs
 */
public class HttpParamProducer {

    @Produces
    @HttpParam("")
    public String getParamValue(HttpServletRequest request, InjectionPoint ip) {
        return request.getParameter(ip.getAnnotated().getAnnotation(HttpParam.class).value());
    }
}
