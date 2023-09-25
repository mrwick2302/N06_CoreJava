package org.tnsif.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("in Main"+Thread.currentThread());
		ChildThreadOne t1=new ChildThreadOne();
		t1.start();
		
		ChildThreadTwo t2=new ChildThreadTwo();
		t2.start();
		try {
		t1.join();
		t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println(Operations.getFactorial(4));
		//System.out.println("is 5 Prime Number?"+Operations.isPrime(5));
		System.out.println("----------------------------");
	}

}
