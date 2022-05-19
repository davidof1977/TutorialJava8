package es.agroseguro.sesion4.herencia.contratacion;

import es.agroseguro.sesion4.herencia.PolizaBase;

public class PolizaContratacion  {
	public PolizaContratacion(PolizaBase base) {
		super();
		this.base = base;
	}
	private PolizaBase base;
	public String getReferencia() {
		return "J101010";
	}
	public PolizaBase getBase() {
		return base;
	}
	public void setBase(PolizaBase base) {
		this.base = base;
	}
}
