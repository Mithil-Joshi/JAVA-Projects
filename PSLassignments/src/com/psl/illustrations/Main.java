package com.psl.illustrations;

import java.util.Scanner;
import java.lang.*;

public class Main {
	public static void main(String args[]) {
		long id;
		String productName, supplierName;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the product id");
		id = in.nextInt();
		System.out.println("Enter the product name");
		productName = in.next();
		System.out.println("Enter the supplier name");
		supplierName = in.next();

		Product p = new Product(id, productName, supplierName);
		System.out.println(p.toString());
		System.out.println(p.getClass());
	}
}
