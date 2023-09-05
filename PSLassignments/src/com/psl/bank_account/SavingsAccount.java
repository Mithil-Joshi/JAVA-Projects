package com.psl.bank_account;

public class SavingsAccount extends Account {
	private String orgName;

	public SavingsAccount() {
		super("accName", "accNo", "bankName");
	}

	public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
		super(accName, accNo, bankName);
		this.orgName = orgName;
	}

	public void display() {
		super.display();
		System.out.println("Organisation Name:" + orgName);
	}

	private String getorgName() {
		return orgName;
	}

	private void setorgName(String orgName) {
		this.orgName = orgName;
	}

}
