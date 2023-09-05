package com.psl.clone_method;

public class Customer implements Cloneable {
	private String name, id, country;

	public Customer() {
	}

	public Customer(String name, String id, String country) {
		this.name = name;
		this.id = id;
		this.country = country;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getCountry() {
		return country;
	}

}
