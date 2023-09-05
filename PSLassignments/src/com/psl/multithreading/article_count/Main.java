package com.psl.multithreading.article_count;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Article> articles = new ArrayList<>();
		System.out.println("Enter the number of lines");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter line " + (i + 1));
			String line = scanner.nextLine();
			Article article = new Article(line);
			articles.add(article);
			article.start(); // start the thread
		}
		int totalCount = 0;
		for (Article article : articles) {
			try {
				article.join();
				System.out.println("thread joint");
				totalCount += article.getCount();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("There are " + totalCount + " articles in the given input");
		scanner.close();
	}
}
