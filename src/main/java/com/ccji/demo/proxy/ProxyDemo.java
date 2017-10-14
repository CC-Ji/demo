package com.ccji.demo.proxy;

import java.lang.reflect.Proxy;

public class ProxyDemo {

	public static void consumer(Hello hello) {
		hello.doSomething();
		hello.doSomethingElse("уехЩ");
	}

	public static void main(String[] args) {
		Hello proxy = (Hello) Proxy.newProxyInstance(
				Hello.class.getClassLoader(), new Class[] { Hello.class },
				new ProxyHandler(new HelloImpl()));
		//consumer(proxy);
		proxy.doSomethingElse("jcc");
	}
}
