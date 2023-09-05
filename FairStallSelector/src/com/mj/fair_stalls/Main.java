package com.mj.fair_stalls;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Choose Stall Type");
		System.out.println("1)Gold Stall");
		System.out.println("2)Premium Stall");
		System.out.println("3)Executive Stall");
		int choice = in.nextInt();
				
		switch (choice) {
		case 1:
			in.nextLine();
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
			String[] arr1 = in.nextLine().split(",");
			GoldStall s1 = new GoldStall(arr1[0],Integer.parseInt(arr1[1]),arr1[2],Integer.parseInt(arr1[3]));
			s1.display();
			break;
		case 2:
			in.nextLine();
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
			String[] arr2 = in.nextLine().split(",");
			PremiumStall s2 = new PremiumStall(arr2[0],Integer.parseInt(arr2[1]),arr2[2],Integer.parseInt(arr2[3]));
			s2.display();
			break;
		case 3:
			in.nextLine();
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
			String[] arr3 = in.nextLine().split(",");
			ExecutiveStall s3 = new ExecutiveStall(arr3[0],Integer.parseInt(arr3[1]),arr3[2],Integer.parseInt(arr3[3]));
			s3.display();
			break;
		default:
			System.out.println("Invalid Stall Type");
			break;
		}
		in.close();
	}
}
