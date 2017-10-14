package com.ccji.demo.proxy;

public class HelloImpl implements Hello {

	@Override
	public void doSomething() {
		System.out.println("doSomothing!!!");
	}

	@Override
	public void doSomethingElse(String arg) {
		System.out.println("doSomethingElse!!!!!");
	}

}
