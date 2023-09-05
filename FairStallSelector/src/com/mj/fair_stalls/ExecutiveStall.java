package com.mj.fair_stalls;

public class ExecutiveStall implements Stall{
	private String stallName, ownerName;
	private int cost, screen;
	
	public ExecutiveStall() {
		super();
	}

	public ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.screen = screen;
	}

	@Override
	public void display() {
		System.out.println("Stall Name:"+stallName);	
		System.out.println("Cost:"+cost);	
		System.out.println("Owner Name:"+ownerName);	
		System.out.println("Number of Screens:"+screen);		
	}
	
	
	
}
