package com.psl.collections.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> hallNames=new ArrayList<>();
		
		System.out.println("Enter the number of halls:");
		int halls=in.nextInt();
		in.nextLine();
		
		for (int i = 0; i < halls; i++) {
			System.out.println("Enter the Hall Name "+(i+1));
			String name=in.nextLine();
			hallNames.add(name);
		}
		
		System.out.println("Enter the hall name to be searched:");
		String reqdHall=in.nextLine();
		
		if (hallNames.contains(reqdHall)) {
			int n=hallNames.indexOf(reqdHall)+1;
			System.out.println(reqdHall+" hall is found in the list at position "+n);
		} else {
			System.out.println(reqdHall+" hall is not found");
		}
		
		in.close();

	}

}
