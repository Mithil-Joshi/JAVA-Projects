package com.psl.file_writing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("C:\\Users\\Mithil Joshi\\Downloads\\output.csv");
		BufferedWriter bw=new BufferedWriter(fw);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<User> users=new ArrayList<>();
		String str;
		String[] arr;
		int noOfUsers;
		
		System.out.println("Enter the number of users:");
		noOfUsers=Integer.parseInt(br.readLine());
		
		for(int i=0;i<noOfUsers;i++) {
			System.out.println("Enter the details of user : "+(i+1));
			str=br.readLine();
			arr=str.split(",");
			User u=new User(arr[0],arr[1],arr[2],arr[3]);
			users.add(u);
		}
		
		UserBO.writeFile(users, bw);
	}
}
