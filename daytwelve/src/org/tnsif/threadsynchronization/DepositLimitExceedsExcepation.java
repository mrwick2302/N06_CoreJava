package org.tnsif.threadsynchronization;

public class DepositLimitExceedsExcepation extends Exception {

	public DepositLimitExceedsExcepation() {
		super("can't Deposit");
	}
	public DepositLimitExceedsExcepation(String message) {
		super();
	}
}
