package es.agroseguro.functional.sesion2.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import es.agroseguro.functional.beans.Parcela;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Parcela> parcela = new ArrayList<Parcela>();
		parcela.add(new Parcela(3,2,"A"));
		parcela.add(new Parcela(1,2,"b"));
		parcela.add(new Parcela(2,1,"AA"));
		parcela.add(new Parcela(1,3,"1D"));
		parcela.add(new Parcela(3,2,"a"));
		parcela.add(new Parcela(3,4,""));
		
	}

}
