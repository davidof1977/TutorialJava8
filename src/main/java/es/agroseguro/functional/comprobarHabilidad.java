package es.agroseguro.functional;

import es.agroseguro.functional.beans.Animal;

@FunctionalInterface
interface comprobarHabilidad {
	boolean test(Animal a);
}
