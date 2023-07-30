package com.bird;

public class Eagle extends Bird {

	@Override
	public String toString() {
		return "Eagle [getAnimalWithFeather()=" + getAnimalWithFeather() + ", getCanFly()=" + getCanFly()
				+ ", toString()=" + super.toString() + ", getHight()=" + getHight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void showInfo() {
		System.out.println(toString());
	}

}
