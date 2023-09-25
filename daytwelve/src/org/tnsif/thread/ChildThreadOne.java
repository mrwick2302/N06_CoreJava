package org.tnsif.thread;

public class ChildThreadOne extends Thread{
	public void run() {
		System.out.println(Operations.getFactorial(4));
	}

}
