package com.psl.date_formats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat formatter1 = new SimpleDateFormat("EEE,MMM d,yy");
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat formatter3 = new SimpleDateFormat("dd/MM/yyyy");
		Scanner in = new Scanner(System.in);
		String str;
		Date date = new Date();

		System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
		str = in.next();

		try {
			date = formatter.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("Date Format with EEE, MMM d, yy : " + formatter1.format(date));
		System.out.println("Date Format with dd.MM.yyyy : " + formatter2.format(date));
		System.out.println("Date Format with dd dd/MM/yyyy : " + formatter3.format(date));

		in.close();
	}

}
