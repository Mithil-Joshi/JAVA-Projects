package com.psl.multithreading.article_count;

public class Article extends Thread {
	private String line;
	private Integer count;

	// Default constructor
	public Article() {
	}

	// Parameterized constructor
	public Article(String line) {
		this.line = line;
		System.out.println("constructor called");
	}

	// Getter for line attribute
	public String getLine() {
		return line;
	}

	// Setter for line attribute
	public void setLine(String line) {
		this.line = line;
	}

	// Getter for count attribute
	public Integer getCount() {
		return count;
	}

	// Setter for count attribute
	public void setCount(Integer count) {
		this.count = count;
	}

	// Method to count the number of articles in a given line
	public void run() {
		System.out.println("thread started");
		int articleCount = 0;
		String[] words = line.split(" ");
		for (String word : words) {
			if (word.equalsIgnoreCase("a") || word.equalsIgnoreCase("an") || word.equalsIgnoreCase("the")) {
				articleCount++;
			}
		}
		System.out.println("thread finished");
		count = articleCount;
	}
}
