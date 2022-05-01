package es.agroseguro.sesion3.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedComodin {
	public static void main(String... strings) {
		List<CharSequence> listaCharSquence = new ArrayList<CharSequence>();

		StringBuilder sb = new StringBuilder("Quack");
		String s = "Woof";

		addSonido(listaCharSquence, sb);
		addSonido(listaCharSquence, s);
		
		listaCharSquence.forEach(System.out::println);
		
		List<Object> listaObject = new ArrayList<>();
		addSonido(listaObject, sb);
		addSonido(listaObject, s);
		
		listaObject.forEach(System.out::println);
		
		//¿Que pasaria?
		List<String> listaString = new ArrayList<>();
//		addSonido(listaString, sb);
//		addSonido(listaString, s);
		
		listaString.forEach(System.out::println);
		


	}

	/**
	 * Se pueden añadir nuevos elemenentos a la lista que sean CharSquence o subtipos de la misma
	 * @param list
	 * @param cs
	 */
	public static void addSonido(List<? super CharSequence> list, CharSequence cs) {
		list.add(cs);
		
		//No compila, solo podemos añadir CharSequence o subtipo de charSequence
		//list.add((Object)"un sonido");
		
		
		//¿Que pasaria si asignasemos null a la lista?
		//list = null;
		
	}
	

}
