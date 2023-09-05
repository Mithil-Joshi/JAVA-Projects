package com.mj.parking_ticket_generator;

import java.util.Date;

public class Ticket{
    private String ticketNo;
	private Date parkedTime;
	private Double cost;
	
	public Ticket() {
		super();
	}
	
	public Ticket(String ticketNo, Date parkedTime, Double cost) {
		super();
		this.ticketNo = ticketNo;
		this.parkedTime = parkedTime;
		this.cost = cost;
	}

	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	public Date getParkedTime() {
		return parkedTime;
	}
	public void setParkedTime(Date parkedTime) {
		this.parkedTime = parkedTime;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
	
}