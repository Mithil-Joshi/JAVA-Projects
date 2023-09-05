package com.psl.clone_method;

public class Complaint {
	String complaint;
	Customer customer;

	public Complaint() {
	}

	public Complaint(String complaint, Customer customer) {
		this.complaint = complaint;
		this.customer = customer;
	}

	void display() {

		// System.out.println("Name : "+customer.getName()+" ID : "+customer.getId()+"
		// Country : "+customer.getCountry()+" Complaint : "+complaint);
	}

}
