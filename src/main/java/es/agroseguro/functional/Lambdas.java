package es.agroseguro.functional;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdas {
	public static void main(String...strings) {
				
		Predicate<String> predicado = mensaje -> mensaje.length() > 5;
		System.out.println(predicado.test("Mas de 5 posiciones"));
		
		Consumer<String> imprimir = cadena -> System.out.println(cadena);
		imprimir.accept("Hola mundo");
		
		BiConsumer<String, String> imprimir2 = (a,b) -> System.out.println(a + " " + b);
		imprimir2.accept("Hola", "Mundo");
		
		Supplier<String> generadorDeCadenas = () -> new String("Hola Mundo");
		String unaCadena = generadorDeCadenas.get();
		
		Function<String, Integer> size = cadena -> cadena.length();
		System.out.println(size.apply(unaCadena));
		
		BiFunction<Double, Double, Double> potencia = (n , m) -> Math.pow(n, m);
		System.out.println(potencia.apply(2.0, 2.0));
		
		
	}
	
	
}
