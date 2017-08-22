package com.ccji.demo.cfx;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * cfx≤‚ ‘
 * @author CC-Ji
 * @date 2017-8-22
 */
public class WscxfTest {

    ApplicationContext context = null;
    
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("classpath:cfx-client.xml");
        System.out.println("context init result : " + (context!=null? true:false) );
    }
    
    @Test
    public void cfxServer(){
    	//context = new ClassPathXmlApplicationContext("cfx-client.xml");
        WelcomeWS welcome =  (WelcomeWS) context.getBean("welcomeWsclient");
        System.out.println(welcome.welcomeMessage("This if first cfx ws ."));
    }
}
