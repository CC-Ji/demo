package com.ccji.demo.thread;

public class SerialNumberGenrator {

	private static volatile int serialNumber = 0;

	public static int nextSeriaNumber() {
		return serialNumber++;
	}

}
