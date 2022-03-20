package es.agroseguro.functional.beans;

public class Parcela {
	private int numero;
	private int hoja;

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

	@Override
	public String toString() {
		return "Parcela [numero=" + numero + ", hoja=" + hoja + "]";
	}
}
