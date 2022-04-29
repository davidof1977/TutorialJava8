package es.agroseguro.functional.sesion1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
				
				//print(animals, a -> a.puedeNadar());
				
				animals.stream().filter(animal -> animal.puedeSaltar()).peek(System.out::println).forEach(a->System.out.print(""));
				Stream<Animal> s1 = animals.stream();
				s1.filter(animal -> animal.puedeSaltar()).peek(System.out::println).forEach(a->System.out.print(""));
				s1.filter(animal -> animal.puedeSaltar()).peek(System.out::println).forEach(a->System.out.print(""));
				
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
