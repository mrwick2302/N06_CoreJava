package org.tnsif.threadsynchronization;

public interface Bank {
	int DEPOSIT_LIMIT=25000;
	static final int MINIMUM_BALANCE=1000;
	
	void deposit(int amount) throws DepositLimitExceedsExcepation;
	void withdraw(int amount) throws InsufficientBalanceException;

}
