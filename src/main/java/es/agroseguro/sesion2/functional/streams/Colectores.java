package es.agroseguro.sesion2.functional.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Colectores {
	public static void main(String... strings) {
		// Joining collector
		var ohMy = Stream.of("lions", "tigers", "bears");
		String result = ohMy.collect(Collectors.joining(", "));
		System.out.println(result); // lions, tigers, bears

		// AveraringInt
		ohMy = Stream.of("lions", "tigers", "bears");
		Double result2 = ohMy.collect(Collectors.averagingInt(String::length));
		System.out.println(result2); // 5.333333333333333

		// toCollection
		ohMy = Stream.of("lions", "tigers", "bears");
		TreeSet<String> result3 = ohMy.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result3); // [tigers]

		// MaxBy
		ohMy = Stream.of("lions", "tigers", "bears");
		Optional<String> opt = ohMy.collect(Collectors.maxBy((s1, s2) -> s1.length() - s2.length()));
		System.out.println(opt.get()); // [tigers]

		// toMap
		ohMy = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
		System.out.println(map); // {lions=5, bears=5, tigers=6}

		ohMy = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> map2 = ohMy.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
		System.out.println(map2); // {5=lions,bears, 6=tigers}
		System.out.println(map2.getClass());

		ohMy = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, String> map3 = ohMy
				.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
		System.out.println(map3); // // {5=lions,bears,6=tigers}
		System.out.println(map3.getClass()); // class java.util.TreeMap

		// Collecting Using Grouping, Partitioning, and Mapping

		// groupingBy
		ohMy = Stream.of("lions", "tigers", "bears");
		Map<Integer, List<String>> map4 = ohMy.collect(Collectors.groupingBy(String::length));
		System.out.println(map4); // {5=[lions, bears], 6=[tigers]}

		// groupingBy a un set
		ohMy = Stream.of("lions", "tigers", "bears");
		Map<Integer, Set<String>> map5 = ohMy.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(map5); // {5=[lions, bears], 6=[tigers]

		// groupingBy a un TreMap que contiene Set
		ohMy = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, Set<String>> map6 = ohMy
				.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
		System.out.println(map); // {5=[lions, bears], 6=[tigers]}

		// Partitioning
		ohMy = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map7 = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 5));
		System.out.println(map7); // {false=[tigers], true=[lions, bears]

		ohMy = Stream.of("lions", "tigers", "bears");
		Map<Boolean, Set<String>> map8 = ohMy
				.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
		System.out.println(map); // {false=[], true=[lions, tigers, bears]}

		ohMy = Stream.of("lions", "tigers", "bears");
		Map<Integer, Long> map9 = ohMy.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(map9); // {5=2, 6=1}

	}
}
