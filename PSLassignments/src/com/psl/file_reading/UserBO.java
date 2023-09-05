package com.psl.file_reading;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserBO {
	
	public List<User> readFromFile(BufferedReader br){
		List<User> newusers=new ArrayList<>();
		try {
			String str;
			while((str=br.readLine()) != null) {
				String[] strarr=str.split(",");
				User user=new User(strarr[0],strarr[1],strarr[2],strarr[3]);
				newusers.add(user);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return newusers;
	}
	
	public void display(List<User> list) {
		System.out.printf("%-15s %-20s %-15s %s\n","Name","Email","Username","Password");
		for (User user : list) {
			System.out.printf("%-15s %-20s %-15s %s\n", user.getName(),user.getEmail(),user.getUsername(),user.getPassword());
		}
	}
}
 