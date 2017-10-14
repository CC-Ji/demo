package com.ccji.demo.thread;

public class ThreadVariations {
	
	public static void main(String[] args){
		new InnerThread1("InnerThread1");
		new InnerThread2("InnerThread2");
		new InnerRunnerble1("InnerRunnerble1");
		new InnerRunnable2("InnerRunnable2");
		new ThreadMethod("ThreadMethod").runTask();
	}

}
