package com.pgr.eightpm.inner;

public enum Weeks {

	//Status --> Inprogress, Faliure, Success
	
	SUNDAY("1"), MONDAY("2");
	
	private String value;
	
	private Weeks(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	
	
	
	
}
