package es.agroseguro.sesion3.generics;

public class SizeLimitJaula<T, U> {
	private T contenido;
	private U sizeLimit;

	public SizeLimitJaula(T contenido, U sizeLimit) {
		super();
		this.contenido = contenido;
		this.sizeLimit = sizeLimit;
	}

	public T vaciarContenido() {
		return contenido;
	}

	public void empaquetar(T contenido) {
		this.contenido = contenido;
	}
	
	public void definirSizeLimit(U sizeLimit) {
		this.sizeLimit = sizeLimit;
	}
}
