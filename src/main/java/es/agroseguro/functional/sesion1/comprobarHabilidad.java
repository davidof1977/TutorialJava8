package es.agroseguro.functional.sesion1;

import es.agroseguro.functional.beans.Animal;

@FunctionalInterface
interface comprobarHabilidad {
	boolean test(Animal a);
	
}
