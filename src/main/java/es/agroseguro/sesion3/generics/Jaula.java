package es.agroseguro.sesion3.generics;

public class Jaula<T> {
	private T contenido;

	public T vaciarContenido() {
		return contenido;
	}

	public void empaquetar(T contenido) {
		this.contenido = contenido;
	}
}
