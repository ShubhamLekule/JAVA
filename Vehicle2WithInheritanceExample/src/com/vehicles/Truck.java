package com.vehicles;

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
		super();
		this.steering = "Not Mentioned";
		this.musicSystem = "Not Mentioned";
		this.seatBelt = "Not Mentioned";
		this.airConditioner = "Not Mentioned";
		this.container = "Not Mentioned";
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

	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem() + ", getSeatBelt()="
				+ getSeatBelt() + ", getAirConditioner()=" + getAirConditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
