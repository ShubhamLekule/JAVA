package com.showanimal;

import com.animal.*;
import com.bird.*;
import com.fish.*;
import com.reptile.*;

public class ShowAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.showInfo();
		Bird b = new Bird();
		b.showInfo();
		Reptile r = new Reptile();
		r.showInfo();
		Fish f = new Fish();
		f.showInfo();
		Eagle e = new Eagle();
		e.showInfo();
		Eel el = new Eel();
		el.showInfo();
		Crocodile c = new Crocodile();
		c.showInfo();

	}

}
