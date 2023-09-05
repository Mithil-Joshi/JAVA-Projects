package com.psl.multithreading.city_count;

import java.util.ArrayList;
import java.util.List;

public class CityCount extends Thread {
	private String city;
	private int count;
	private List<User> userList = new ArrayList<User>();

	public CityCount(String city, ArrayList<User> userList) {
		super();
		this.city = city;
		this.userList = userList;
		this.count = 0;
	}

	public void run() {
		for (User each : userList) {
			if (each.getCity().equals(city)) {
				count += 1;
			}
		}
	}

	public String getCity() {
		return city;
	}

	public int getCount() {
		return count;
	}
}
