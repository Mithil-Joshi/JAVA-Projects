package com.psl.compare_dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfEvents, cnt = 0;
		String str;
		String[] segment;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		List<Event> events = new ArrayList<>();
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		System.out.println("Enter the number of Events");
		noOfEvents = in.nextInt();
		in.nextLine();

		System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");
		for (int i = 0; i < noOfEvents; i++) {
			str = in.nextLine();
			segment = str.split(",");
			try {
				Event e = new Event(segment[0], formatter.parse(segment[1]), formatter.parse(segment[2]));
				events.add(e);
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		}

		for (Event each : events) {
			cal1.setTime(each.getStartDate());
			cal2.setTime(each.getEndDate());
			if (cal2.get(Calendar.DAY_OF_YEAR) - cal1.get(Calendar.DAY_OF_YEAR) == 0) {
				cnt++;
				each.setODE(true);
			}
		}
		System.out.println("1-day Events:");

		if (cnt != 0) {
			for (Event each : events) {

				if (each.getODE()) {
					System.out.println(each.getEventName());
				}
			}
		} else {
			System.out.println("No Events");
		}

		in.close();
	}

}
