package com.psl.super_method;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		String name, detail, type, ownername, str, startDate, endDate;
		String arr[];
		double costPerDay;
		int noOfStall, noOfSeats, choice;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice:\n1.Exhibition event\n2.Stage event\n");
		choice = in.nextInt();
		DateTimeFormatter formatter;
		LocalDate date1, date2;
		long daysBetween;
		double gst;

		switch (choice) {
		case 1:
			System.out.println("Enter the details of exhibition:");
			in.nextLine();
			str = in.nextLine();
			arr = str.split(",");
			name = arr[0];
			detail = arr[1];
			type = arr[2];
			ownername = arr[3];
			costPerDay = Double.parseDouble(arr[4]);
			noOfStall = Integer.parseInt(arr[5]);
			Exhibition e = new Exhibition(name, detail, type, ownername, costPerDay, noOfStall);

			System.out.println("Enter the starting date of the event:");
			startDate = in.nextLine();
			System.out.println("Enter the ending date of the event:");
			endDate = in.nextLine();
			formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			date1 = LocalDate.parse(startDate, formatter);
			date2 = LocalDate.parse(endDate, formatter);
			daysBetween = ChronoUnit.DAYS.between(date1, date2);
			gst = e.getCostPerDay() * 0.05 * daysBetween;
			System.out.println("The GST to be paid is Rs." + gst);
			break;

		case 2:
			System.out.println("Enter the details of stage event:");
			in.nextLine();
			str = in.nextLine();
			arr = str.split(",");
			name = arr[0];
			detail = arr[1];
			type = arr[2];
			ownername = arr[3];
			costPerDay = Double.parseDouble(arr[4]);
			noOfSeats = Integer.parseInt(arr[5]);
			StageEvent s = new StageEvent(name, detail, type, ownername, costPerDay, noOfSeats);

			System.out.println("Enter the starting date of the event:");
			startDate = in.nextLine();
			System.out.println("Enter the ending date of the event:");
			endDate = in.nextLine();
			formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			date1 = LocalDate.parse(startDate, formatter);
			date2 = LocalDate.parse(endDate, formatter);
			daysBetween = ChronoUnit.DAYS.between(date1, date2);
			gst = s.getCostPerDay() * 0.05 * daysBetween;
			System.out.println("The GST to be paid is Rs." + gst);
			break;
		}
		in.close();
	}
}
