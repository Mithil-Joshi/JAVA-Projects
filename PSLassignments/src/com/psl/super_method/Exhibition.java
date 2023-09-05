package com.psl.super_method;

public class Exhibition extends Event {
	private int noOfStall;

	public Exhibition(String name, String detail, String type, String ownername, double costPerDay, int noOfStall) {
		super(name, detail, type, ownername, costPerDay);
		this.noOfStall = noOfStall;
	}
}
