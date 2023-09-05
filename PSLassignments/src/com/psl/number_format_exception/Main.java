package com.psl.number_format_exception;

import java.io.*;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		double deposit = 0, costPerday = 0;

		System.out.println("Enter the Item type details:");
		System.out.println("Enter the name:");
		try {
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the deposit:");
		try {
			deposit = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the cost per day:");
		try {
			costPerday = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The details of the item type are:");

		Itemtype i = new Itemtype(name, deposit, costPerday);
		System.out.println(i);

	}
}
