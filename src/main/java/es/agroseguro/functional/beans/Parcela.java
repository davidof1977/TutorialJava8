package es.agroseguro.functional.beans;

public class Parcela {
	private int numero;
	private int hoja;
	private String nombre;

	public Parcela( int hoja, int numero, String nombre) {
		super();
		this.numero = numero;
		this.hoja = hoja;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Parcela [hoja=" + hoja+ ", numero=" + numero + ", nombre=" + nombre + "]";
	}
}
