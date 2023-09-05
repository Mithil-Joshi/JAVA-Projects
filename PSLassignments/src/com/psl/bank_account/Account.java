package com.psl.bank_account;

public class Account {
	protected String accName, accNo, bankName;

	public Account(String accName, String accNo, String bankName) {
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}

	protected void display() {
		System.out.println("Account Name:" + accName);
		System.out.println("Account Number:" + accNo);
		System.out.println("Bank Name:" + bankName);
	}

	private String getaccName() {
		return accName;
	}

	private void setaccName(String accName) {
		this.accName = accName;
	}

	private String getaccNo() {
		return accNo;
	}

	private void setaccNo(String accNo) {
		this.accNo = accNo;
	}

	private String getbankName() {
		return bankName;
	}

	private void setbankName(String bankName) {
		this.bankName = bankName;
	}
}
