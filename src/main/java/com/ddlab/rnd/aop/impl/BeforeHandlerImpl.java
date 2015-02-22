package com.ddlab.rnd.aop.impl;

import java.lang.reflect.Method;

import com.ddlab.rnd.aop.BeforeHandler;

public class BeforeHandlerImpl extends BeforeHandler {

	@Override
	public void handleBefore(Object proxy, Method method, Object[] args) {
		
		System.out.println("Handling before actual method execution ........");
	}

}
