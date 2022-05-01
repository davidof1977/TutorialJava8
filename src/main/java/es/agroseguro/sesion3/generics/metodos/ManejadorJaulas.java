package es.agroseguro.sesion3.generics.metodos;

import es.agroseguro.sesion3.generics.Jaula;

public class ManejadorJaulas {
		public static <T> void preparar(T t) {
			System.out.println(" Preparando " + t + " para su envio");
		}
		
		public static <T> Jaula<T> enviar(T t){
			System.out.println("Enviando " + t);
			return new Jaula<T>();
		}
	
}
