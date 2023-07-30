package com.showfeature;

import com.phone.*;
import com.phone.model.*;

public class ShowFeature {

	public static void main(String[] args) {
		Phone phone = new Phone("Feature Phone");
		System.out.println("Phone : " + phone.getModel());
		phone.feature();

		Samsung note8 = new Samsung("Android Phone");
		System.out.println("Phone : " + note8.getModel());
		note8.feature();

		// In below example feature method get called from Samsung class as priority
		// goes to child class in method overriding
		Phone note10 = new Samsung("Note 10");
		System.out.println(note10.getModel());
		note10.feature();

		// In below example feature method get called from Phone class as there is no
		// overrided method in child class
		Phone nokia = new Nokia("Nokia 3310");
		System.out.println("Phone : " + nokia.getModel());
		nokia.feature();

	}

}
