package es.agroseguro.sesion4.herencia.siniestros;

import es.agroseguro.sesion4.herencia.IPoliza;
import es.agroseguro.sesion4.herencia.PolizaBase;
import es.agroseguro.sesion4.herencia.contratacion.AppContratacion;

public class AppSiniestros {
	
	public static void main(String...strings) {
		IPoliza p = new PolizaSiniestros();
		imprimirSiniestro((PolizaSiniestros)p);
		AppContratacion contratacion = new AppContratacion();
		contratacion.contratarPoliza(p);
	}

	private static void imprimirSiniestro(PolizaSiniestros p) {
		System.out.println(p.getSiniestro());
	}
	
}
