package es.agroseguro.sesion2.functional.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 4, 2, 5, 9, 9, 3);
		
		//Filter y collect(terminal)
		List<Integer> mayor5 =  numeros.stream().filter(n -> n > 5).collect(Collectors.toList());
		
		//distinct
		Stream<Integer> distintos = numeros.stream().distinct(); //No tiene terminal operation y por tanto no se ejecuta
		distintos.forEach(System.out::print);
		
		System.out.println();
		
		//limit and skip
		numeros.stream().limit(5).skip(1).forEach(System.out::print);
		
		System.out.println();
		
		//Map
		List<String> palabras = List.of("May", "the", "force", "be", "with", "you");
		List<Integer> size = palabras.stream().map(palabra -> palabra.length()).collect(Collectors.toList());
		size.forEach(System.out::print);
		System.out.println();
		Optional<String> frase = palabras.stream().map(palabra -> palabra.concat(" ")).reduce((p1,p2) -> p1.concat(p2));
		System.out.println(frase.get());
		
		//FlatMap
		List<String> zero = List.of();
		var one = List.of("Bonobo");
		var two = List.of("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap(m -> m.stream()).forEach(System.out::println);
		
		//Sorted
		palabras.stream().sorted();
		palabras.forEach(System.out::print);
		System.out.println();
		palabras.stream().sorted().forEach(System.out::print);
		System.out.println();
		palabras.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		
		System.out.println();
		
		//Peek
		List<String> palabrasLargas = palabras.stream().filter(p-> p.length()>3).peek(System.out::print).collect(Collectors.toList());
		
		
		
	}

}
