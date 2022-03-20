package es.agroseguro.functional.sesion1;

import es.agroseguro.functional.beans.Animal;

public class CheckIfHopper implements comprobarHabilidad {
	public boolean test(Animal a) {
		return a.puedeSaltar();
	}
}
