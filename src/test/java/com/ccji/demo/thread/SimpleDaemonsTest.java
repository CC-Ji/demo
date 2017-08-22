package com.ccji.demo.thread;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

public class SimpleDaemonsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRun() throws Exception {
		for(int i = 0; i < 10; i++){
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);
			daemon.start();
		}
		System.out.print("All deamons started");
		TimeUnit.MILLISECONDS.sleep(175);
	}

}
