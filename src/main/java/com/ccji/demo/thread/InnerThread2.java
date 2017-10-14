package com.ccji.demo.thread;

public class InnerThread2 {
	
	private int countDown=5;
	private Thread t;
	public InnerThread2(String name){
		t=new Thread(name){
			public void run(){
				while(true){
					System.out.println(this);
					if(--countDown==0)
						return;
				}
			}
			public String toString(){
				return getName() +": "+countDown;
			}
		};
		t.start();
	}

}
