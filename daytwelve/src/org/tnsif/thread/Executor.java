package org.tnsif.thread;

public class Executor {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Is "+Thread.currentThread().getName());
		ChildThread threadOne=new ChildThread();
		System.out.println("Is "+threadOne.getName()+ ": is Alive"+ threadOne.isAlive());
		
		ChildThread threadTwo=new ChildThread();
		System.out.println("Is "+threadTwo.getName()+ ": is Alive"+ threadTwo.isAlive());
		
		threadOne.join();
		threadTwo.join();
		System.out.println("---------------------------------------------");
	}

}
