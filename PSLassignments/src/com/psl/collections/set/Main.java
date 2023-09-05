package com.psl.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String choice = null;
		Set<String> eids=new HashSet<>();
		Set<String> reqdIds= new HashSet<>();
		
		do {
			System.out.println("Enter Email address");
			String email=in.nextLine();
			eids.add(email);
			System.out.println("Do you want to Continue?(yes/no)");
			choice=in.nextLine();
		} while (choice.equals("yes"));
		
		System.out.println("Enter the email addresses to be searched separated by comma");
		String str=in.nextLine();
		String[] arr=str.split(",");
		for (String string : arr) {
			reqdIds.add(string);
		}
		
		
		if (eids.containsAll(reqdIds)) {
			System.out.println("Email addresses are present");
		} else {
			System.out.println("Email addresses are not present");
		}
		
		in.close();
	}

}
