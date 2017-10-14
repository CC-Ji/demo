package com.ccji.demo.thread;

public class BasicThreads {
	public static void main(String[] args){
		Thread t = new Thread(new LiftOff());
		System.out.println(t.getId());
		t.start();
		System.out.println("Waiting for LiftOff");
	}
}
