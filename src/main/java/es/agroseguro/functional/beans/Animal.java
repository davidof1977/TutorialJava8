package es.agroseguro.functional.beans;

public class Animal {
	private String especie;
	private boolean puedeSaltar;
	private boolean puedeNadar;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		especie = speciesName;
		puedeSaltar = hopper;
		puedeNadar = swimmer;
	}

	public boolean puedeSaltar() {
		return puedeSaltar;
	}

	public boolean puedeNadar() {
		return puedeNadar;
	}

	public String toString() {
		return especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
}
