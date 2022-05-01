package es.agroseguro.sesion2.functional.optional;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;

import es.agroseguro.beans.Parcela;

public class DealingWithOptional {
	public static void main(String[] args) {
		Optional<String> optCadena = Optional.empty();
		
		System.out.println(optCadena.orElse("Valor por defecto"));
		
		if(optCadena.isEmpty()) {
			optCadena = Optional.of("Hola mundo");
		}
		
		System.out.println(optCadena.orElseGet(()-> "Valor por defecto"));
		
		Optional<Parcela> optParcela = Optional.empty();
		
		try {
			optParcela.orElseThrow();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
}
