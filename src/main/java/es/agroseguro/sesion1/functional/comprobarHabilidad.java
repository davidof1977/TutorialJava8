package es.agroseguro.sesion1.functional;

import es.agroseguro.beans.Animal;

@FunctionalInterface
interface comprobarHabilidad {
	boolean test(Animal a);
}
