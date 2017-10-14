package com.ccji.demo.httpinvoker;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ccji.webservice.httpinvoker.HttpInvokerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml","classpath*:spring-mvc.xml","classpath*:httpinvoker-client.xml" })
public class HttpInvokerTest {

	@Resource(name="httpInvokerService")
	private HttpInvokerService httpInvokerService;
	
	@Test
	public void test() {
		System.out.println(httpInvokerService.sayHello("HttpInvoker"));
	}

}
