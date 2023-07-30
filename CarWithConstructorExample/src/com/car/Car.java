package com.car;

public class Car {

	private int speed;
	private String door;
	private String color;
	private String engin;

	public Car(int speed, String door, String color, String engin) {
		this.speed = speed;
		this.door = door;
		this.color = color;
		this.engin = engin;
	}

	public Car() {
		speed = 0;
		door = "open";
		color = "no color assign";
		engin = "off";
	}

	public Car(Car c) {
		speed = c.speed;
		door = c.door;
		color = c.color;
		engin = c.engin;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEngin() {
		return engin;
	}

	public void setEngin(String engin) {
		this.engin = engin;
	}

	public String run() {
		if (engin.equals("on") && door.equals("closed")) {
			return "running";
		} else {
			return "Not running";
		}
	}

}
