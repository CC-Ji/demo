package com.ccji.demo.hessian;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ccji.webservice.hessian.HessianService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-mvc.xml","classpath:hessian-client.xml" })
public class HessianTest {

	@Autowired
	private HessianService hessianService;
	
	@Test
	public void test() {
		System.out.println(hessianService.sayHello("Hessian!"));
	}
	
}
