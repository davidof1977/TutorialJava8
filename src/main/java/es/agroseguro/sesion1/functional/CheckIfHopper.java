package es.agroseguro.sesion1.functional;

import es.agroseguro.beans.Animal;

public class CheckIfHopper implements comprobarHabilidad {
	public boolean test(Animal a) {
		return a.puedeSaltar();
	}
}
