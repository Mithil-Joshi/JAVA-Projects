package com.psl.string_builder;

public class Item {
	private String name, type;
	private int cost, availableQuantity;

	public Item() {
		super();
	}

	public Item(String name, String type, int cost, int availableQuantity) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.availableQuantity = availableQuantity;
	}

	StringBuilder display() {
		StringBuilder sb = new StringBuilder();

		if (availableQuantity != 0) {
			return sb.append(name + "," + type + "," + cost + "," + "Available");
		} else {
			return sb.append(name + "," + type + "," + cost + "," + "Not Available");
		}
	}
}
