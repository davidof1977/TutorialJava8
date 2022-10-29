package es.agroseguro.sesion3.generics;

import es.agroseguro.sesion3.generics.beans.Animal;

public interface IEnviableAnimal<T extends Animal> {
	void enviar(T t);
}
