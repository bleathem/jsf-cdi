/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.verborgh.enterprise.inject.impl;

import be.verborgh.enterprise.inject.ELValue;
import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;

/**
 *
 * @author verborghs
 */
public class ELValueProducer {

    @Produces
    @ELValue("")
    public Object getParamValue(FacesContext fctx, InjectionPoint ip) {
        String expression = ip.getAnnotated().getAnnotation(ELValue.class).value();
        Class clazz = (Class) ip.getType();

        ExpressionFactory  efact = fctx.getApplication().getExpressionFactory();
        ValueExpression valueExpression 
                = efact.createValueExpression(fctx.getELContext(),
                                                expression,
                                                clazz);

        return valueExpression.getValue(fctx.getELContext());
    }
}
