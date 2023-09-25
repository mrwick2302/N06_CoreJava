package org.tnsif.threadsynchronization;

public class Executor {

	public static void main(String[] args) {
		Account accObj=new Account (101,"MrWick",10000);
		AccountThread threadOne =new AccountThread();
		AccountThread threadTwo =new AccountThread();
		threadOne.setAmount(2000);
		threadOne.setType("Withdraw");
		
		threadTwo.setAmount(8000);
		threadTwo.setType("Withdraw");
		
		threadOne.start();
		threadTwo.start();
		System.out.println(accObj);
		
		try {
			threadOne.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
