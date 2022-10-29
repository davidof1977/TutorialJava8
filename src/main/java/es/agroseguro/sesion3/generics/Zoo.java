package es.agroseguro.sesion3.generics;

import es.agroseguro.sesion3.generics.beans.Cebra;
import es.agroseguro.sesion3.generics.beans.Elefante;
import es.agroseguro.sesion3.generics.beans.Robot;

public class Zoo {
	public static void main (String...strings) {
		Elefante e = new Elefante();
		Jaula<Elefante> jaula = new Jaula<>();
		jaula.empaquetar(e);
		//Trnasportamos la jaula a un nuevo zoo
		e = jaula.vaciarContenido();
		
		Cebra c = new Cebra();
		Jaula<Cebra> jaula2 = new Jaula<>();
		jaula2.empaquetar(c);
		//Trnasportamos la jaula a un nuevo zoo
		c = jaula2.vaciarContenido();
		
		Robot r = new Robot();
		Jaula<Robot> jaula3 = new Jaula<>();
		jaula3.empaquetar(r);
		//Trnasportamos la jaula a un nuevo zoo
		r = jaula3.vaciarContenido();
		
		Integer toneladas = 10;
		SizeLimitJaula<Elefante, Integer> jaulaLimitada = new SizeLimitJaula<>(e,toneladas);
		jaula.empaquetar(e);
		//Trnasportamos la jaula a un nuevo zoo
		e = jaula.vaciarContenido();
	}
	
/* Esto compila???	
	public void empaquetar(Jaula<Elefante> j, Object e) {
		j.empaquetar((Elefante)e);
	}
	
	public void empaquetar(Jaula<Robot> j, Object r) {
		j.empaquetar((Robot)r);
	}
*/

}
