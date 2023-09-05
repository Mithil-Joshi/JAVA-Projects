package com.mj.fair_stalls;

public class GoldStall implements Stall{
	private String stallName, ownerName;
	private int cost, tvSet;
	
	public GoldStall() {
		super();
	}

	public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.tvSet = tvSet;
	}

	@Override
	public void display() {
		System.out.println("Stall Name:"+stallName);	
		System.out.println("Cost:"+cost);	
		System.out.println("Owner Name:"+ownerName);	
		System.out.println("Number of TV sets:"+tvSet);	
	}
	
	
}
