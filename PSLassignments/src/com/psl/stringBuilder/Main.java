package com.psl.stringBuilder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the code");
		String code = scanner.next();

		String cityCode = code.substring(0, 2);
		String referenceNumber = code.substring(2);

		switch (cityCode) {
		case "DH":
			cityCode = cityCode.replace("DH", "DEL");
			break;
		case "MB":
			cityCode = cityCode.replace("MB", "MUB");
			break;
		case "KL":
			cityCode = cityCode.replace("KL", "KOL");
			break;
		default:
			System.out.println("Invalid city code");
			return;
		}

		referenceNumber = String.format("%05d", Integer.parseInt(referenceNumber));
		System.out.println("Formatted code");
		StringBuilder formattedCode = new StringBuilder();
		formattedCode.append(cityCode);
		formattedCode.append(referenceNumber);
		System.out.println(formattedCode);
	}
}
