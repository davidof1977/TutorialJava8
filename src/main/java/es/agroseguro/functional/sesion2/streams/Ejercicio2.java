package es.agroseguro.functional.sesion2.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import es.agroseguro.functional.beans.Parcela;
import es.agroseguro.functional.beans.TipoCapital;
import es.agroseguro.functional.utils.GeneradorBeans;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Parcela> parcelas = GeneradorBeans.generarParcelas(3,5);
		
		//Obtener las parcelas cuyos numero de parcela sean pares y pintar sus nombres
		List<Parcela> parcelas2 = parcelas.stream().filter(p-> p.getNumero() % 2 == 0).collect(Collectors.toList());
		parcelas2.forEach(p -> System.out.println(p.getNombre()));
		
		//Obtener una nueva lista de parcelas en las que todos los tipos de capital tenga valor mayor que 5000
		parcelas2 = parcelas.stream().filter(p-> p.getTiposCapital().stream().allMatch(tc-> tc.getProduccion()>5000)).collect(Collectors.toList());
		//Comprobar que lo anterior es correcto
		parcelas2.stream().flatMap(p->p.getTiposCapital().stream()).forEach(System.out::println);
		
		//Obtener el valor de produccion de todas las parcelas
		int suma = parcelas.stream().flatMap(p -> p.getTiposCapital().stream()).map(tc-> tc.getProduccion()).reduce(0,(p1,p2)-> p1 + p2);
		System.out.println("Valor produccion= " + suma);
	}
}
