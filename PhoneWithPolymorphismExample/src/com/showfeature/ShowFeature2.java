package com.showfeature;

import com.phone.Phone;
import com.phone.model.Nokia;
import com.phone.model.Samsung;

public class ShowFeature2 {

	public static void main(String[] args) {
		// we creted mathod phone() inside same ShowFeature2 class and calling Phone's
		// object from tha method
		Phone samsung = new ShowFeature2().phone(1);
		System.out.println(samsung.getModel());
		samsung.feature();

		Phone nokia = new ShowFeature2().phone(2);
		System.out.println(nokia.getModel());
		nokia.feature();

	}

	public Phone phone(int brand) {
		switch (brand) {
		case 1:
			return new Samsung("note 5");
		case 2:
			return new Nokia("nokia 6611");

		}
		return null;
	}
}
