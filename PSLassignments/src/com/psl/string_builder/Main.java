package com.psl.string_builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str;
		int noOfItems;
		String[] words;
		List<Item> items = new ArrayList<>();

		System.out.println("Enter the number of items:");
		noOfItems = in.nextInt();
		in.nextLine();

		System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
		for (int j = 0; j < noOfItems; j++) {
			str = in.nextLine();
			words = str.split("\\$");
			Item i = new Item(words[0], words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]));
			items.add(i);
		}

		System.out.println("Items:");
		for (Item each : items) {
			System.out.println(each.display().toString());
		}
		in.close();
	}

}