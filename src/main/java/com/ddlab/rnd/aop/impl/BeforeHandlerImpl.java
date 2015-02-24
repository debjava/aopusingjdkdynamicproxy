package com.ddlab.rnd.aop.impl;

import java.lang.reflect.Method;

import com.ddlab.rnd.aop.BeforeHandler;

/**
 * The Class BeforeHandlerImpl provides implementation before
 * actual execution of method.
 *
 * @author Debadatta Mishra
 */
public class BeforeHandlerImpl extends BeforeHandler {

	/* (non-Javadoc)
	 * @see com.ddlab.rnd.aop.BeforeHandler#handleBefore(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public void handleBefore(Object proxy, Method method, Object[] args) {
		//Provide your own cross cutting concern
		System.out.println("Handling before actual method execution ........");
	}
}
