package es.agroseguro.functional.sesion2.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import es.agroseguro.functional.beans.Parcela;
import es.agroseguro.functional.utils.GeneradorBeans;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Parcela> parcelas = GeneradorBeans.generarParcelas(3,5);
		
		parcelas.stream().flatMap(p -> p.getTiposCapital().stream()).forEach(System.out::println);
		//Obtener la lista de parcelas que 
		
		//Obtener el valor de produccion de todas las parcelas
		int suma = parcelas.stream().flatMap(p -> p.getTiposCapital().stream()).map(tc-> tc.getProduccion()).reduce(0,(p1,p2)-> p1 + p2);
		System.out.println("Valor produccion= " + suma);
	}

}
