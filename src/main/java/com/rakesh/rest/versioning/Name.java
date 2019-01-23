package com.rakesh.rest.versioning;

public class Name {
	
	private String first_name;
	private String second_name;
	
	
	
	public Name() {
		super();
	}


	public Name(String first_name, String second_name) {
		super();
		this.first_name = first_name;
		this.second_name = second_name;
	}
	
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getSecond_name() {
		return second_name;
	}
	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	
	
}
