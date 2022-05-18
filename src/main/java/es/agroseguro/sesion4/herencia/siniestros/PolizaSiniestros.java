package es.agroseguro.sesion4.herencia.siniestros;

import es.agroseguro.sesion4.herencia.PolizaBase;

public class PolizaSiniestros extends PolizaBase {

	@Override
	public int getLinea() {
		// TODO Auto-generated method stub
		return 300;
	}
	
	public int getSiniestro() {
		return 123;
	}

}
