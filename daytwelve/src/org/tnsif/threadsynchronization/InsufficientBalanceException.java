package org.tnsif.threadsynchronization;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException() {
		super("can't Withdraw");
	}
	public InsufficientBalanceException(String message) {
		super(message);
	}

}
