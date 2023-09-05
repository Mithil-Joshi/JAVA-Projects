package com.mj.fair_stalls;

public class PremiumStall implements Stall {
	private String stallName, ownerName;
	private int cost, projector;
	
	
	public PremiumStall() {
		super();
	}
	
	public PremiumStall(String stallName, int cost, String ownerName, int projector) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.projector = projector;
	}

	@Override
	public void display() {
		System.out.println("Stall Name:"+stallName);	
		System.out.println("Cost:"+cost);	
		System.out.println("Owner Name:"+ownerName);	
		System.out.println("Number of Projectors:"+projector);		
	}
	
	
}
