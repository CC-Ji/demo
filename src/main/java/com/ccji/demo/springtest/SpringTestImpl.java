package com.ccji.demo.springtest;

import org.springframework.stereotype.Service;

@Service("springTest")
public class SpringTestImpl implements SpringTest {

	@Override
	public String sayHi(String param) {
		return "Hello------" + param;
	}

}
