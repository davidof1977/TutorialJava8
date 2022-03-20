package es.agroseguro.functional.sesion1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import es.agroseguro.functional.beans.Parcela;

public class Ejercicio1 {

	public static void main(String[] args) {
		List<Parcela> parcela = new ArrayList<Parcela>();
		parcela.add(new Parcela(3,2,"A"));
		parcela.add(new Parcela(1,2,"b"));
		parcela.add(new Parcela(2,1,"AA"));
		parcela.add(new Parcela(1,3,"1D"));
		parcela.add(new Parcela(3,2,"a"));
		parcela.add(new Parcela(3,4,""));
		//Ordenar las parcelas en orden alfabetico por nombre.
		parcela.sort((p1,p2)->p1.getNombre().compareTo(p2.getNombre()));
		
		//Obtener todas aquellas cuyo numero de parcela sea par
		List<Parcela> parcelasPares = new ArrayList<Parcela>();
		Predicate<Parcela> pares = p -> p.getNumero() % 2 == 0;
		for (Parcela p3 : parcela) {
			if (pares.test(p3)) {
				parcelasPares.add(p3);
			}
		}
		//Imprimir los nombres de las parcelas resultantes usando un consumer
		Consumer<Parcela> consumer = p -> System.out.println(p);;
		for (Parcela parcela2 : parcelasPares) {
			consumer.accept(parcela2);
		}
		
		//Hacer una funcion que reciba una parcela y devuelva la suma de su hoja y parcela.
		Function<Parcela, Integer> func1 = p -> p.getNumero() + p.getNumero();
		
		//Hacer una funcion que reciba dos parcelas y devuelva aquella cuyo numero de hoja sea mayor
		BinaryOperator<Parcela> operator = (p1,p2) -> p1.getHoja()>p2.getHoja()?p1:p2;
		
		//Todo junto
		System.out.println("Usando streams");
		parcela.stream().sorted((p1,p2)->p1.getNombre().compareTo(p2.getNombre())).
			filter(pares).forEach(System.out::println);
	}

}
