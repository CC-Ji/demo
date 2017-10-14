package com.ccji.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	
	private Object proxied;
	
	public ProxyHandler(Object proxied){
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(args!=null){
			for(Object arg:args){
				System.out.println(" " + arg);
			}
		}
		return method.invoke(proxied, args);
	}

}
