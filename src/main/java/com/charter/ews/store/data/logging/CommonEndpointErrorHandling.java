package com.charter.ews.store.data.logging;


import java.lang.annotation.ElementType;

import com.charter.ews.store.data.exception.CharterWebFaultException;
import com.charter.ews.store.data.exception.NoDataFoundException;
import com.charter.ews.store.data.exception.StoreDataServiceException;


@java.lang.annotation.Inherited
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface CommonEndpointErrorHandling {

	Class<?>[] exceptions() default {NoDataFoundException.class, StoreDataServiceException.class,CharterWebFaultException.class};
    

}