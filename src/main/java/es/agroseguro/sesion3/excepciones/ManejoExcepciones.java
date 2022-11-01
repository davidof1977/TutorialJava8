package es.agroseguro.sesion3.excepciones;

public class ManejoExcepciones {

	public static void main(String[] args) {
		UnInterface implementacion = null;
		try {
		
			implementacion = new ImplementarUnInterface();
			implementacion.metodoLanzaCheckedException();

		}catch(CustomCheckedException e) {
			System.out.println("Excepcion manejada");
			//Vulnerabilidad, siempre usar un logger.
			e.printStackTrace();;
			
		}finally {
			System.out.println("Excepcion no manejada");
			implementacion.metodoNoLanzaCheckedxception();
		}
	}

}
