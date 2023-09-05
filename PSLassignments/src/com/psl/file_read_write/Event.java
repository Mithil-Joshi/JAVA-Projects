package com.psl.file_read_write;

public class Event {
	private String eventName,ownerName;
	private int attendeesCount;
	
	public Event() {
		super();
	}

	public Event(String eventName, int attendeesCount, String ownerName) {
		super();
		this.eventName = eventName;
		this.ownerName = ownerName;
		this.attendeesCount = attendeesCount;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getAttendeesCount() {
		return attendeesCount;
	}

	public void setAttendeesCount(int attendeesCount) {
		this.attendeesCount = attendeesCount;
	}
}
