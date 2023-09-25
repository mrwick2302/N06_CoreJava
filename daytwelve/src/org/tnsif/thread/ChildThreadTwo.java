package org.tnsif.thread;

public class ChildThreadTwo extends Thread{
	public void run() {
		System.out.println("is 6 Prime Number?"+Operations.isPrime(6));
	}
}
