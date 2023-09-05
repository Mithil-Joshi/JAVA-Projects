package com.psl.super_method;

public class StageEvent extends Event {
	private int noOfSeats;

	public StageEvent(String name, String detail, String type, String ownername, double costPerDay, int noOfSeats) {
		super(name, detail, type, ownername, costPerDay);
		this.noOfSeats = noOfSeats;
	}

}