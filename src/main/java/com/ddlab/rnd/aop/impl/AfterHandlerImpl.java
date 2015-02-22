package com.ddlab.rnd.aop.impl;

import java.lang.reflect.Method;

import com.ddlab.rnd.aop.AfterHandler;

public class AfterHandlerImpl extends AfterHandler {

	@Override
	public void handleAfter(Object proxy, Method method, Object[] args) {
		
		System.out.println("Handling after actual method execution ........");
	}

}
