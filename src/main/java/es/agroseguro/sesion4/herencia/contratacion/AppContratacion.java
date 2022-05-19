package es.agroseguro.sesion4.herencia.contratacion;

import es.agroseguro.sesion4.herencia.IPoliza;
import es.agroseguro.sesion4.herencia.PolizaBase;

public class AppContratacion {
	
	public void contratarPoliza(IPoliza ipoliza) {

		PolizaContratacion poliza = new PolizaContratacion((PolizaBase)ipoliza);
		
		System.out.println(poliza.getBase().getLinea());
		System.out.println(poliza.getReferencia());
		
		
	}

}
