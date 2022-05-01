package es.agroseguro.sesion1.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import es.agroseguro.beans.Parcela;

public class BuilitFunctionalInterfaces {

	public static void main(String[] args) {
		//Predicados
		Predicate<String> mayor8 = s -> s.length() > 8;
		Predicate<String> containsA = s -> s.contains("A");
		String cadena = "Tengo mas de 8 caracteres y una A mayuscula";
		
		boolean cumpleCondiciones = mayor8.and(containsA).test(cadena);
		
		if (cumpleCondiciones)
			System.out.println("Condiciones cumplidas");
		else
			System.out.println("Vuelve a intentarlo");
		
		//Consumers
		Consumer<String> c1 = s -> System.out.println(s);
		c1.andThen(c1).accept("Una cadema");
		
		//Funciones
		BiFunction<String, String, Integer> transform = (a,b) -> a.length() + b.length();
		Function<Integer, Integer> multiplicarX2 = a -> a * 2;
		
		Integer numero =  transform.andThen(multiplicarX2).apply("Hola", "Mundo");
		System.out.println(numero);	
		
		//UnaryOpertor
		UnaryOperator<Integer> operador = n -> n++;
		
		//BinaryOperator
		BinaryOperator<Integer> biOperator = (n,m) -> n + m;
		
		//Comparators
		Comparator<Integer> comp1 = (n, m) ->  n - m;
		
		List<Integer> lista = Arrays.asList(1,4,2,9,34,5);
		
		lista.sort(comp1);
		
		System.out.println(lista);
		
		List<Parcela> parcela = new ArrayList<Parcela>();
		parcela.add(new Parcela(3,2));
		parcela.add(new Parcela(1,2));
		parcela.add(new Parcela(2,1));
		parcela.add(new Parcela(1,3));
		parcela.add(new Parcela(3,1));
		
		Comparator<Parcela> compNumero = (n, m) -> n.getNumero() - m.getNumero();
		Comparator<Parcela> compHoja = (n, m) -> n.getHoja() - m.getHoja();
		
		parcela.sort(compNumero.thenComparing(compHoja));
		System.out.println(parcela);
		
		parcela.sort(compNumero.thenComparing(compHoja).reversed());
		System.out.println(parcela);
		
	}

}
