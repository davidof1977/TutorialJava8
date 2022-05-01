package es.agroseguro.sesion3.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Comodin {
	public static void main (String...strings) {
		List<String> palabras = new ArrayList<>();
		palabras.add("Java");
		//imprimirLista(palabras);
		//imprimirListaComodin(palabras);
	}
	
	/**
	 * Acepta listas de tipo Object
	 * @param lista
	 */
	public static void imprimirLista(List<Object> lista) {
		lista.forEach(System.out::println);
	}
	
	/**
	 * Acepta lista de cualquier tipo
	 * @param lista
	 */
	public static void imprimirListaComodin(List<?> lista) {
		lista.forEach(System.out::println);
	}

}
