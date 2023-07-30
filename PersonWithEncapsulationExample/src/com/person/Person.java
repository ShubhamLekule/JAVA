package com.person;

public class Person {
//to encapsulate we make properties private
	private String name;
	private int age;
	private String gender;

	public Person(String name, int age, String gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	// We not using default constructor to restrict initialization for encapsulation
	/*
	 * public Person() {
	 * 
	 * }
	 */

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public boolean setAge(int age) {
		if (age > 0 && age < 100) {
			this.age = age;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender() + "]";
	}

}
