package com.ccji.demo.cfxws;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WscxfTest {

    ApplicationContext context = null;
    
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("classpath:cfx-server.xml","classpath:cfx-client.xml");
        System.out.println("context init result : " + (context!=null? true:false) );
    }
    
    @Test
    public void cfxServer(){
        WelcomeWS welcome =  (WelcomeWS) context.getBean("welcomeWsclient");
        System.out.println(welcome.welcomeMessage("This if first cfx ws ."));
    }
}
