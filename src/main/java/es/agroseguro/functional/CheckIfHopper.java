package es.agroseguro.functional;

import es.agroseguro.functional.beans.Animal;

public class CheckIfHopper implements comprobarHabilidad {
	public boolean test(Animal a) {
		return a.puedeSaltar();
	}
}
