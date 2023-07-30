package com.vehicle;

import com.parent.Vehicle;

public class Truck extends Vehicle {
	private String steering;
	private String musicSystem;
	private String seatBelt;
	private String airConditioner;
	private String container;

	public Truck(String engine, String wheels, String seats, String fuelTank, String lights, String steering,
			String musicSystem, String seatBelt, String airConditioner, String container) {
		super(engine, wheels, seats, fuelTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.seatBelt = seatBelt;
		this.airConditioner = airConditioner;
		this.container = container;
	}

	public Truck() {

	}

	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getSeatBelt() {
		return seatBelt;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public String getContainer() {
		return container;
	}

	public String run() {
		if (engine.equals("on")) {
			return "Running";
		} else {
			return "Not Running";
		}
	}

}
