package es.agroseguro.sesion3.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedComodin {
	public static void main (String...strings) {
		//List<Number> numeros = new ArrayList<Integer>();
		List<Integer> integers = Arrays.asList(new Integer(1),Integer.valueOf(2),3);
		System.out.println(total(integers));
		
		List<Long> longs = Arrays.asList(new Long(1), Long.valueOf(2), Long.valueOf(2));
		System.out.println(total(longs));
		
		//¿Que pasaria?
		//List<Object> objects = Arrays.asList(new Long(1), Long.valueOf(2), Long.valueOf(2));
		//System.out.println(total(objects));
	
	}
	
	/**
	 * El parametro numeros acepta listas que sean del tipo Number o subtipos de Number
	 * @param numeros
	 * @return
	 */
	public static long total(List<? extends Number> numeros) {
		//numeros.stream().reduce((n,j)-> sumar(n.longValue(),  j.longValue())).get();
		long count = 0;
		for (Number number : numeros)
			count += number.longValue();
		return count;
	}
	
	/**
	 * En este caso NO se puenden añadir nuevos numeros, porque estamos diciendo que la lista numeros puede ser de <b>un único</b> tipo 
	 * que extienda de Number, pero solo del tipo que definamos, no podemos mezclar tipos
	 * @param numeros
	 */
	public static void meterNumeros(List<? extends Number> numeros) {
		//numeros.add(Integer.valueOf(1)); //No compila
		//numeros.add(Long.valueOf(1)); //No compila
	}
	
	/**
	 * En este caso SI se puenden añadir nuevos numeros, porque estamos diciendo que la lista numeros puede ser de <b>cualquier</b> tipo ue extienda de Number.
	 * @param numeros
	 */
	public static void meterNumeros2(List<Number> numeros) {
		numeros.add(Integer.valueOf(1));
		numeros.add(Long.valueOf(1));
	}

	

}
