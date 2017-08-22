package com.ccji.demo.cfx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * cfx¿Í»§¶Ë
 * @author CC-Ji
 * @date 2017-8-22
 */
public class WelcomeClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"cfx-client.xml");
		WelcomeWS welcomWS = (WelcomeWS) context.getBean("welcomeWsclient");
		System.out.println(welcomWS.welcomeMessage("CC-Ji"));
	}

}
