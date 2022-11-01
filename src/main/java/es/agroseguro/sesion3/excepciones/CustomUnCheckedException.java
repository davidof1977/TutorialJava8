package es.agroseguro.sesion3.excepciones;

public class CustomUnCheckedException extends RuntimeException {

	public CustomUnCheckedException() {
		super();
	}

	public CustomUnCheckedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CustomUnCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomUnCheckedException(String message) {
		super(message);
	}

	public CustomUnCheckedException(Throwable cause) {
		super(cause);
	}

}
