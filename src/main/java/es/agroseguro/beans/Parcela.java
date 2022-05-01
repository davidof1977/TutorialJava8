package es.agroseguro.beans;

import java.util.List;

public class Parcela {
	private int numero;
	private int hoja;
	private String nombre;
	private List<TipoCapital> tiposCapital;

	public Parcela( int hoja, int numero, String nombre) {
		super();
		this.numero = numero;
		this.hoja = hoja;
		this.nombre = nombre;
	}
	
	public Parcela( int hoja, int numero, String nombre, List<TipoCapital> tipos) {
		super();
		this.numero = numero;
		this.hoja = hoja;
		this.nombre = nombre;
		this.tiposCapital = tipos;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getHoja() {
		return hoja;
	}

	public Parcela(int numero, int hoja) {
		super();
		this.numero = numero;
		this.hoja = hoja;
	}

	public void setHoja(int hoja) {
		this.hoja = hoja;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public List<TipoCapital> getTiposCapital() {
		return tiposCapital;
	}

	public void setTiposCapital(List<TipoCapital> tiposCapital) {
		this.tiposCapital = tiposCapital;
	}

	@Override
	public String toString() {
		return "Parcela [numero=" + numero + ", hoja=" + hoja + ", nombre=" + nombre + ", tiposCapital=" + tiposCapital
				+ "]";
	}
}
