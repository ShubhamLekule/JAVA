package com.getperson;

import com.person.*;

public class GetPerson {

	public static void main(String[] args) {
		Person p = new Person("Shubham", 28, "male");
		System.out.println(p);
		// we restricted minus age for encapsulation
		System.out.println("age changed " + p.setAge(-19));

	}

}
