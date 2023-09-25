package org.tnsif.threadsynchronization;

public class AccountThread extends Thread{
	String type;
	Account acc;
	int amount;
	
	public AccountThread()
	{
}
	public AccountThread(Account acc) {
		this.acc=acc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void run() {
		try {
			
			if( type.equals("deposite"))
			acc.deposit(amount);
			else if(type.equals("withdraw"))
				acc.withdraw(amount);
		} catch (DepositLimitExceedsExcepation e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
}
}
