package es.agroseguro.functional.sesion2.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 4, 2, 5, 9, 3);
		
		//Count: numero de elementos en el stream
		System.out.println("count() " + numeros.stream().count());
		
		//min,max
		Optional<Integer> max = numeros.stream().max((i,j) -> i-j);
		System.out.println("Max: " + max.orElse(0));
		
		//findAny, findFirst
		System.out.println(numeros.parallelStream().findAny());
		System.out.println(numeros.parallelStream().findFirst());
		
		//AllMatch,AnyMatch,NoneMatch
		System.out.println("Todos los numeros son pares? " + numeros.stream().allMatch(n-> n % 2 == 0));
		System.out.println("Algun numero es par? " + numeros.stream().anyMatch(n-> n % 2 == 0));
		
		//forEach
		numeros.stream().forEach(System.out::print);
		
		//reduce
		System.out.println();
		Optional<Integer> suma = numeros.stream().reduce((n,m)-> n+m);
		System.out.println("suma " + suma.get());
		
		
		System.out.println("suma " + numeros.stream().reduce(0,(n,m)-> n+m));
		var array = new String[] { "w", "o", "l", "f" };
		var result = "";
		for (var s: array) result = result + s;
		System.out.println(result); // wolf
		
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("", String::concat);
		System.out.println(word); // wolf
		
		//Collect
		Map<Boolean,List<Integer>> mapa = numeros.stream().collect(Collectors.partitioningBy(n-> n%2==0));
		System.out.println("Solo los numeros pares");
		mapa.entrySet().stream().filter(e->e.getKey()).forEach(e -> e.getValue().forEach(System.out::println));
		
	}
}
