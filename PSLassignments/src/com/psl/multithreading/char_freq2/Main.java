package com.psl.multithreading.char_freq2;

import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Counters :");
		int count = sc.nextInt();
		sc.nextLine();

		Counter[] threads = new Counter[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Enter text for counter " + (i + 1) + " :");
			String text = sc.nextLine();
			threads[i] = new Counter(text);
			threads[i].start();
		}

		for (int i = 0; i < count; i++) {
			try {
				threads[i].join();
				System.out.println("Counter " + (i + 1) + " Result :");
				threads[i].printResult();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}