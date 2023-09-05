package com.psl.number_format_exception;

public class Itemtype {
	private String name;
	private double deposit, costPerday;

	public Itemtype() {
	}

	public Itemtype(String name, double deposit, double costPerday) {
		this.name = name;
		this.deposit = deposit;
		this.costPerday = costPerday;
	}

	public String toString() {
		return "Name:" + name + "\nDeposit:" + deposit + "\nCost Per Day:" + costPerday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getCostPerday() {
		return costPerday;
	}

	public void setCostPerday(double costPerday) {
		this.costPerday = costPerday;
	}

}
