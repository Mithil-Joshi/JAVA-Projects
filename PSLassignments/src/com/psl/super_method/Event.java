package com.psl.super_method;

public class Event {
	private String name, detail, type, ownername;
	double costPerDay;

	public Event(String name, String detail, String type, String ownername, double costPerDay) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownername = ownername;
		this.costPerDay = costPerDay;
	}

	public double getCostPerDay() {
		return costPerDay;
	}
}