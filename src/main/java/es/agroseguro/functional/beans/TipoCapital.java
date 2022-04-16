package es.agroseguro.functional.beans;

public class TipoCapital {
	private int id;
	private int produccion;
	public int getId() {
		return id;
	}
	public TipoCapital(int id, int produccion) {
		super();
		this.id = id;
		this.produccion = produccion;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProduccion() {
		return produccion;
	}
	public void setProduccion(int produccion) {
		this.produccion = produccion;
	}
	@Override
	public String toString() {
		return "TipoCapital [id=" + id + ", produccion=" + produccion + "]";
	}

}
