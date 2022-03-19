package es.agroseguro.functional;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
	}

}
