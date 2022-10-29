package es.agroseguro.sesion3.generics;

import es.agroseguro.sesion3.generics.beans.Animal;

public class CajaParaEnviarAnimales<T extends Animal> implements IEnviableAnimal<T> {
	public void enviar(T t) { } ;

}
