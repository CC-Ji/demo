package com.ccji.demo.jax;

public class HelloClient {
	
	public static void main(String[] args){
		HelloServiceService helloServiceService = new HelloServiceService();
		HelloService helloService = helloServiceService.getHelloServicePort();
		System.out.println(helloService.sayHello("jichengchuan"));
	}

}
