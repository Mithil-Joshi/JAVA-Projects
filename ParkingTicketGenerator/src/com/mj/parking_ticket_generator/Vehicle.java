package com.mj.parking_ticket_generator;

public class Vehicle{
    
	private String registrationNo;
	private String name;
	private String type;
	private Double weight;
	private Ticket ticket;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(String registrationNo, String name, String type, Double weight, Ticket ticket) {
		super();
		this.registrationNo = registrationNo;
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.ticket = ticket;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
}