package es.agroseguro.sesion3.excepciones;

public class ImplementarUnInterface implements UnInterface {

	@Override
	public void metodoLanzaCheckedException() throws CustomCheckedException {
		throw new CustomCheckedException("Checked exception lanzada desde interface");
	}

	/**
	 * 
	 * @throws CustomUnCheckedException
	 */
	@Override
	public void metodoNoLanzaCheckedxception() {
//NO COMPILA		
		//throw new CustomCheckedException("Checked exception lanzada desde interface");
						
//Compilar pero es mala practica, seria mejor una unchecked exception personalizada
		//throw new RuntimeException("UnChecked exception lanzada desde interface"); 
		
		throw new CustomUnCheckedException("UnChecked exception lanzada desde interface");
	}
}
