package com.psl.bank_account;

public class CurrentAccount extends Account {
	private String tinNumber;

	public CurrentAccount() {
		super("accName", "accNo", "bankName");
	}

	public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
		super(accName, accNo, bankName);
		this.tinNumber = tinNumber;
	}

	public void display() {
		super.display();
		System.out.println("TIN Number:" + tinNumber);
	}

	private String gettinNumber() {
		return tinNumber;
	}

	private void settinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

}
