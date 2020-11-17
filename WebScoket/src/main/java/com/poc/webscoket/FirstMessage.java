package com.poc.webscoket;

public class FirstMessage {

	public FirstMessage() {
		super();
	}

	public FirstMessage(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
