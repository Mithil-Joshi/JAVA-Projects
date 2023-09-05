package com.psl.multithreading.city_count;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str;
		ArrayList<User> userList = new ArrayList<User>();
		List<CityCount> threads = new ArrayList<>();
		String[] details;
		int noOfUsers, noOfCities;

		System.out.println("Enter the number of users:");
		noOfUsers = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= noOfUsers; i++) {
			System.out.println("Enter the details of user" + i);
			str = in.nextLine();
			details = str.split(",");
			User u = new User(details[0], details[1], details[2], details[3]);
			userList.add(u);
		}

		System.out.println("Enter the number of cities:");
		noOfCities = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= noOfCities; i++) {
			System.out.println("Enter the name of city" + i);
			str = in.nextLine();
			CityCount c = new CityCount(str, userList);
			threads.add(c);
			c.start();
		}

		for (CityCount each : threads) {
			try {
				each.join();
				System.out.println(each.getCity() + "--" + each.getCount());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
