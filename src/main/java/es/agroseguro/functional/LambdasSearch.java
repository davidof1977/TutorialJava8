package es.agroseguro.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import es.agroseguro.functional.beans.Animal;

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

			private static void print(List<Animal> animals, Predicate<Animal> checker) {
				for (Animal animal : animals) {

		// the general check
					if (checker.test(animal))
						System.out.print(animal + " ");
				}
				System.out.println();
			}
}
