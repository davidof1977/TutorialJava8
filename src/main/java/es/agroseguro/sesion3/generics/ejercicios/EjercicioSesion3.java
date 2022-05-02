package es.agroseguro.sesion3.generics.ejercicios;

import java.util.List;

import es.agroseguro.sesion3.generics.ejercicios.model.Boy;
import es.agroseguro.sesion3.generics.ejercicios.model.Hombre;
import es.agroseguro.sesion3.generics.ejercicios.model.Madre;
import es.agroseguro.sesion3.generics.ejercicios.model.Mujer;
import es.agroseguro.sesion3.generics.ejercicios.model.Persona;

/** Define una clase que pueda almacenar un matrimonio, como nos gusta la
	inclusión, el matrimonio puede ser de cualquier tipo. 
	La clase a su vez tiene un metodo tener hijos que devuelve un hijo,
	que a veces será una instancia de la clase Boy y a veces de la clase Girl.
	Si no es posible tener hijos, deberá devolver una checked exception personalizada.
	
	Define una clase "Matrona" con un método etático asistirParto que reciba un
	matrimonio y devuelva una clase que pueda contener niños o niñas
**/

public class EjercicioSesion3 {
			
	public static void main(String... strings) {
		// Usa las clases anteriores para crear una instancia de la clase matrimonio e
		// invoca al método de la clase "Matrona". 
		Hombre h = new Hombre();
		Mujer m = new Mujer();

				
		// Invoca a los métodos que hay al final del ejercicio.
		List<Persona> personas = List.of(new Hombre(), new Mujer(), new Boy());
		//Metodo1
		//Metodo2
		List<Mujer> mujeres = List.of(new Mujer(), new Madre());
		//Metodo3

	}

	//Metodo1
	// Crea un método que acepta una lista de personas o de sus subtipos y los pinte
	// por pantalla. Aprovechemos para usar lambadas a la hora de pintarlos.
	

	//Metodo2
	// Crea un método que acepta una lista de Hombres o de sus ancestros 
	//y pinte por pantalla solo aquellas personas que sean hombres, provechemos para usar lambadas a la hora de pintarlos.
	
	
	//Metodo3
	// Crea un método que acepta una lista de mujeres o de sus subtipos 
	
}