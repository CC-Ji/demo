package com.ccji.demo.cfxws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WelcomeClient {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("cfx-client.xml");
		WelcomeWS welcomWS = (WelcomeWS)context.getBean("welcomeWsclient");
		System.out.println(welcomWS.welcomeMessage("CC-Ji"));
	}

}
