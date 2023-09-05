package com.psl.multithreading.char_freq;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number of Counters :");
		int numThreads = scanner.nextInt();
		scanner.nextLine(); // Consume the remaining newline character

		Thread[] threads = new Thread[numThreads];
		for (int i = 0; i < numThreads; i++) {
			System.out.print("Enter text for counter " + (i + 1) + " :");
			String str = scanner.nextLine();
			threads[i] = new CharacterFrequencyThread(str);
			threads[i].start();
		}

		// Wait for all threads to complete
		for (int i = 0; i < numThreads; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Print the character frequencies for each thread
		for (int i = 0; i < numThreads; i++) {
			CharacterFrequencyThread thread = (CharacterFrequencyThread) threads[i];
			System.out.println("Counter " + (i + 1) + " Result :");
//         System.out.println(thread.getCharacterFrequencies());
			thread.displayCharacterFrequencies();
		}
	}

}

class CharacterFrequencyThread extends Thread {
	private String str;
	private HashMap<Character, Integer> charFreqs;

	public CharacterFrequencyThread(String str) {
		this.str = str;
		this.charFreqs = new HashMap<>();
	}

	@Override
	public void run() {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int freq = charFreqs.getOrDefault(c, 0);
			charFreqs.put(c, freq + 1);
		}
	}

	public void displayCharacterFrequencies() {
//     return charFreqs;

		for (Entry<Character, Integer> each : charFreqs.entrySet()) {
			System.out.print(each.getKey() + ":" + each.getValue() + " ");
		}
		System.out.println();
	}
}
