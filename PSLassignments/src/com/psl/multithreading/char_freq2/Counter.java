package com.psl.multithreading.char_freq2;

import java.util.*;

public class Counter extends Thread {

	public String text;
	private HashMap<Character, Integer> h;

	public Counter(String text) {
		this.text = text;
		h = new HashMap<>();
	}

	@Override
	public void run() {
		for (char x : text.toCharArray()) {
			if (h.get(x) == null) {
				h.put(x, 1);
			} else {
				int value = h.get(x);
				h.put(x, value + 1);
			}
		}
	}

	public void printResult() {
		TreeMap<Character, Integer> sortedMap = new TreeMap<>(h);

		for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
			System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
		}
		System.out.println();
	}
}
