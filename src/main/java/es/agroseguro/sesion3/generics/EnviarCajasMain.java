package es.agroseguro.sesion3.generics;

import es.agroseguro.sesion3.generics.beans.Animal;
import es.agroseguro.sesion3.generics.beans.Cebra;
import es.agroseguro.sesion3.generics.beans.Elefante;
import es.agroseguro.sesion3.generics.beans.Robot;

public class EnviarCajasMain {
	public static void main (String...strings) {
		Elefante e = new Elefante();
		Cebra cebra = new Cebra();
		CajaParaEnviarAnimales<Animal> caja = new CajaParaEnviarAnimales<>();
		caja.enviar(e);
		caja.enviar(cebra);
		
		Robot r = new Robot();
		CajaParaEnviarLoQueSea<Robot> cajaLoQueSea = new CajaParaEnviarLoQueSea<>();
		cajaLoQueSea.enviar(r);
		
		CajaParaEnviarRobots cajaRobot = new CajaParaEnviarRobots();
		cajaRobot.enviar(r);
		
		//caja.enviar(r);

	}
	

}
