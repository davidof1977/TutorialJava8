package es.agroseguro.functional.sesion2.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import es.agroseguro.functional.beans.Parcela;
import es.agroseguro.functional.beans.TipoCapital;
import es.agroseguro.functional.utils.GeneradorBeans;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Parcela> parcelas = GeneradorBeans.generarParcelas(3,5);
		
		//Imprimir la lista de parcelas
		parcelas.forEach(p -> {
			System.out.println(p);
//			p.getTiposCapital().forEach(System.out::println);
		});
		System.out.println("------------------------------");
		//Obtener las parcelas cuyos numero de parcela sean pares y pintar sus nombres
		List<Parcela> parcelas2 = parcelas.stream().filter(p-> p.getNumero() % 2 == 0).collect(Collectors.toList());
		parcelas2.forEach(p -> System.out.println(p.getNombre()));
		System.out.println("------------------------------");
		//Obtener una nueva lista de parcelas en las que todos los tipos de capital tenga valor mayor que 5000
		parcelas2 = parcelas.stream().filter(p-> p.getTiposCapital().stream().allMatch(tc-> tc.getProduccion()>5000)).collect(Collectors.toList());
		//Comprobar que lo anterior es correcto
		parcelas2.stream().flatMap(p->p.getTiposCapital().stream()).forEach(System.out::println);
		System.out.println("------------------------------");
		//Obtener el valor de produccion de todas las parcelas
		int suma = parcelas.stream().flatMap(p -> p.getTiposCapital().stream()).map(tc-> tc.getProduccion()).reduce(0,(p1,p2)-> p1 + p2);
		System.out.println("Valor produccion= " + suma);
		System.out.println("------------------------------");
		//Obtener la parcela cuyo valor de produccion sea el mas alto
		List<Parcela> aux = parcelas.stream().sorted((p1,p2) -> compareParcelas(p1, p2)).collect(Collectors.toList());
		Optional<Parcela> maxP = aux.stream().findFirst();
		
		System.out.println(maxP);
	}
	
	private static int compareParcelas(Parcela p1, Parcela p2) {
		Optional<TipoCapital> opt1 =  p1.getTiposCapital().stream().max((t1,t2) -> t1.getProduccion() - t2.getProduccion());
		Optional<TipoCapital> opt2 =  p2.getTiposCapital().stream().max((t1,t2) -> t1.getProduccion() - t2.getProduccion());
		return opt2.get().getProduccion()-opt1.get().getProduccion();
	}
	
	
}
