package es.agroseguro.sesion3.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import es.agroseguro.sesion3.generics.ejercicios.model.Chico;
import es.agroseguro.sesion3.generics.ejercicios.model.Hijo;

public class ListasConComodinesSuper {

	public static void main(String...strings) {

		List<Hijo> hijos = List.of(new Hijo(), new Hijo());
		List<Chico> chicos = List.of(new Chico(), new Chico());
		hijos.add(new Chico());
		
		pintarHijos(hijos);
		//pintarHijos(chicos);		
	}
	
	private static void pintarHijos(List<? super Hijo> hijos) {
		hijos.forEach(System.out::println);
		hijos.add(new Hijo());
		hijos.add(new Chico());
	}
}
