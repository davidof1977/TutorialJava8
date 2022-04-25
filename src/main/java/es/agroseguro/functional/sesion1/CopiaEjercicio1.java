package es.agroseguro.functional.sesion1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import es.agroseguro.functional.beans.Parcela;

public class CopiaEjercicio1 {

	public static void main(String[] args) {
		List<Parcela> parcela = new ArrayList<Parcela>();
		parcela.add(new Parcela(3,2,"A"));
		parcela.add(new Parcela(1,2,"b"));
		parcela.add(new Parcela(2,1,"AA"));
		parcela.add(new Parcela(1,3,"1D"));
		parcela.add(new Parcela(3,2,"a"));
		parcela.add(new Parcela(3,4,""));
		//Ordenar las parcelas en orden alfabetico por nombre.
		
		//Obtener todas aquellas cuyo numero de parcela sea par

		//Imprimir los nombres de las parcelas resultantes usando un consumer
		
		//Hacer una funcion que reciba una parcela y devuelva la suma de su hoja y parcela.
		
		//Hacer una funcion que reciba dos parcelas y devuelva aquella cuyo numero de hoja sea mayor
		
		//Todo junto
	}

}
