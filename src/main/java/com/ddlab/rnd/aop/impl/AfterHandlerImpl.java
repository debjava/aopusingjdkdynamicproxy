package com.ddlab.rnd.aop.impl;

import java.lang.reflect.Method;

import com.ddlab.rnd.aop.AfterHandler;

/**
 * The Class AfterHandlerImpl provides an implementation of business logic which
 * will be executed after the actual method execution.
 *
 * @author Debadatta Mishra
 */
public class AfterHandlerImpl extends AfterHandler {

	/* (non-Javadoc)
	 * @see com.ddlab.rnd.aop.AfterHandler#handleAfter(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public void handleAfter(Object proxy, Method method, Object[] args) {
		//Provide your own cross cutting concern
		System.out.println("Handling after actual method execution ........");
	}

}
