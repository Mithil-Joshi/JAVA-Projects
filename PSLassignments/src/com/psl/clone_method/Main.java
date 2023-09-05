package com.psl.clone_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		String name, id, country, complaint, choice;
		List<Complaint> list = new ArrayList<Complaint>();
		int cnt = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the customer name");
		name = in.nextLine();
		System.out.println("Enter the id");
		id = in.nextLine();
		System.out.println("Enter the country");
		country = in.nextLine();
		System.out.println("Enter the complaint");
		complaint = in.nextLine();
		Customer c1 = new Customer(name, id, country);
		Complaint cc1 = new Complaint(complaint, c1);
		list.add(cc1);

		System.out.println("Add another complaint ??");
		choice = in.nextLine();

		while (choice.equals("yes")) {
			System.out.println("Enter the customer name");
			name = in.nextLine();
			if (!name.equals("")) {
				System.out.println("Enter the id");
				id = in.nextLine();
				System.out.println("Enter the country");
				country = in.nextLine();
				System.out.println("Enter the complaint");
				complaint = in.nextLine();
				Customer c2 = new Customer(name, id, country);
				Complaint cc2 = new Complaint(complaint, c2);
				list.add(cc2);
				System.out.println("Add another complaint ??");
				choice = in.nextLine();
				cnt++;
			} else {
				System.out.println("Same customer");
				System.out.println("Enter the complaint");
				complaint = in.nextLine();
				Customer temp = list.get(cnt).customer;
				Customer c2 = (Customer) temp.clone();
				Complaint cc2 = new Complaint(complaint, c2);
				list.add(cc2);
				System.out.println("Add another complaint ??");
				choice = in.nextLine();
				cnt++;
			}
		}
		System.out.println("Complaint Details");
		for (Complaint c : list) {
			c.display();
		}

	}

}