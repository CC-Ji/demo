package com.ccji.demo.burlap;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ccji.webservice.burlap.BurlapService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"classpath:spring-mvc.xml", "classpath:burlap-client.xml" })
public class BurlapTest {

	@Resource(name = "burlapService")
	private BurlapService burlapService;

	@Test
	public void test() {
		System.out.println(burlapService.sayHello("Burlap"));
	}

}
