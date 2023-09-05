package com.psl.collections.multiMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Map<String,List<Address>> addrmap=new HashMap<>();
		
		System.out.println("Enter the number of address");
		int noOfAddr=in.nextInt();
		in.nextLine();
		
		for (int i = 0; i < noOfAddr; i++) {
			System.out.println("Enter the address "+(i+1)+" details");
			String str=in.nextLine();
			String[] arr=str.split(",");
			Address addr=new Address(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4]));
			
			if(addrmap.containsKey(addr.getCity())) {
				addrmap.get(addr.getCity()).add(addr);
			} else {
				List<Address> addrList=new ArrayList<>();
				addrList.add(addr);
				addrmap.put(addr.getCity(), addrList);
			}
		}
		
		System.out.println("Enter the city to be searched");
		String reqdAddr=in.nextLine();
		
		if (addrmap.containsKey(reqdAddr)) {
			System.out.printf("%-15s %-15s %-15s %-15s %s\n","Line1","Line2","City","State","Pincode");
			for (Address address : addrmap.get(reqdAddr)) {
				System.out.printf("%-15s %-15s %-15s %-15s %s\n",address.getAddressLine1(),address.getAddressLine2(),address.getCity(),address.getState(),address.getPincode());
			}
		} else {
			System.out.println("Searched city not found");
		}
		
		in.close();
	}
}
