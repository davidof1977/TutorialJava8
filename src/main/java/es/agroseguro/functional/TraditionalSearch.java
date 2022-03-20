package es.agroseguro.functional;

import java.util.*;

import es.agroseguro.functional.beans.Animal;

public class TraditionalSearch {
	public static void main(String[] args) {

	// list of animals
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

	// pass class that does check
		print(animals, new CheckIfHopper());
	}

	private static void print(List<Animal> animals, comprobarHabilidad checker) {
		for (Animal animal : animals) {


			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}
