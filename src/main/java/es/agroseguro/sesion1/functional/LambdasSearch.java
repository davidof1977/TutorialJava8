package es.agroseguro.sesion1.functional;

import java.util.ArrayList;
import java.util.List;

import es.agroseguro.beans.Animal;

public class LambdasSearch {
	public static void main(String[] args) {

		// list of animals
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		// pass class that does check
		print(animals, a -> a.puedeSaltar());

		print(animals, a -> a.puedeNadar());

	}

	private static void print(List<Animal> animals, comprobarHabilidad checker) {
		for (Animal animal : animals) {

			// the general check
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}

