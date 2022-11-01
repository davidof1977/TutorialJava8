package es.agroseguro.sesion3.excepciones;

public class CustomCheckedException extends Exception {

	public CustomCheckedException() {
		super();
	}

	public CustomCheckedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CustomCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomCheckedException(String message) {
		super(message);
	}

	public CustomCheckedException(Throwable cause) {
		super(cause);
	}

}
