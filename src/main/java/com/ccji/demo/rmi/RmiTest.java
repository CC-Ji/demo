package com.ccji.demo.rmi;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-mvc.xml","classpath:rmi-client.xml" })
public class RmiTest {

/*    ApplicationContext context = null;
    
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("classpath:rmi-client.xml");
        System.out.println("context init result : " + (context!=null? true:false) );
    }*/
	@Resource
	private RmiService rmiService;
    
	@Test
	public void test() {
		//RmiService rmiService = (RmiService)context.getBean("rmiService");
		System.out.println(rmiService.sayHello("ccji"));
	}

}
