package com.psl.file_reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Mithil Joshi\\Downloads\\input.csv"));
		UserBO userBO=new UserBO();
		List<User> newusers=userBO.readFromFile(br);
		if(newusers.isEmpty()) {
			System.out.println("The list is empty");
		}else {
			userBO.display(newusers);
		}
	}

}
