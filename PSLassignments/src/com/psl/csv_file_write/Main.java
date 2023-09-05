package com.psl.csv_file_write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(System.in);
		FileWriter fr= new FileWriter("C:\\Users\\Mithil Joshi\\Downloads\\airport.csv");
		
		String name,cityName,countryCode;
		
		System.out.println("Enter the name of the airport");		
		name=in.nextLine();
		System.out.println("Enter the city name");
		cityName=in.nextLine();
		System.out.println("Enter the country code");
		countryCode=in.nextLine();
		in.close();

		String str=name+","+cityName+","+countryCode;
		fr.write(str);
		fr.flush();
		fr.close();
	}
}
