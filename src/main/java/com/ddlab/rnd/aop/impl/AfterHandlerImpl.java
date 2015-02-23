package com.ddlab.rnd.aop.impl;

import java.lang.reflect.Method;

import com.ddlab.rnd.aop.AfterHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class AfterHandlerImpl.
 */
public class AfterHandlerImpl extends AfterHandler {

	/* (non-Javadoc)
	 * @see com.ddlab.rnd.aop.AfterHandler#handleAfter(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public void handleAfter(Object proxy, Method method, Object[] args) {
		
		System.out.println("Handling after actual method execution ........");
	}

}
