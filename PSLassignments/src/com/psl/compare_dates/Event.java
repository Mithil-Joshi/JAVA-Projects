package com.psl.compare_dates;

import java.util.Date;

public class Event {
	private String eventName;
	private Date startDate, endDate;
	private Boolean ODE = false;

	public Event() {
		super();
	}

	public Event(String eventName, Date startDate, Date endDate) {
		super();
		this.eventName = eventName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public String getEventName() {
		return eventName;
	}

	public Boolean getODE() {
		return ODE;
	}

	public void setODE(Boolean oDE) {
		ODE = oDE;
	}
}
