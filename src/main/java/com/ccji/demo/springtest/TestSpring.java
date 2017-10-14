package com.ccji.demo.springtest;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml"})
public class TestSpring {

	@Resource(name="springTest")
	SpringTest springTest;
	@Test
	public void test() {
		System.out.println(springTest.sayHi("ccji"));
	}

}
