package com.phone.model;

import com.phone.Phone;

public class Samsung extends Phone {
	private String model;

	public Samsung(String model) {
		super(model);

	}

	public void feature() {
		System.out.println("Android Phone");
	}
}
