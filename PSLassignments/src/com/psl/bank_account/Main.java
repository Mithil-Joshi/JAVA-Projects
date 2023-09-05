package com.psl.bank_account;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int accType;
		String accName, accNo, bankName, orgName, tinNumber, str;
		String[] arr;

		Scanner in = new Scanner(System.in);
		// Scanner in1=new Scanner(System.in).useDelimiter(",");
		System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
		accType = in.nextInt();

		if (accType == 1) {
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			str = in.nextLine();
			arr = str.split(",");
			// accName=arr[0];
			// accNo=arr[1];
			// bankName=arr[2];
			// orgName=arr[3];
			// SavingsAccount s1 = new SavingsAccount(accName, accNo, bankName, orgName);
			// s1.display();
		} else {
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
			str = in.nextLine();
			arr = str.split(",");
			accName = arr[0];
			accNo = arr[1];
			bankName = arr[2];
			tinNumber = arr[3];
			CurrentAccount s2 = new CurrentAccount(accName, accNo, bankName, tinNumber);
			s2.display();
		}
	}
}
