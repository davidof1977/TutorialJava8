package es.agroseguro.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import es.agroseguro.beans.Parcela;
import es.agroseguro.beans.TipoCapital;

public class GeneradorBeans {
	
	
	
	public static List<Parcela> generarParcelas(int hojas, int parcelasHoja){
		List<Parcela> parcelas = new ArrayList<Parcela>();
		TipoCapital tc;
		Random r = new Random(new Date().getTime());
		Parcela p;
		for(int n=1; n<= hojas;n++ ) {
			for(int i=1; i<= parcelasHoja;i++ ) {
				p = generarParcela(r,n,i,"Parcela " + n + "-" + i);
				parcelas.add(p);
			}

		}
		
		return parcelas;
	}

	/**
	 * @param r
	 * @return
	 */
	private static Parcela generarParcela(Random r, int hoja, int numero, String nombre) {
		TipoCapital tc;
		List<TipoCapital> tipos = new ArrayList<TipoCapital>();
		for (int n = 0;n< r.nextInt(3) + 1 ;n++ ) {
			tc = new TipoCapital(n, r.nextInt(45000));
			tipos.add(tc);
		}
		Parcela p = new Parcela(hoja,numero,nombre,tipos);
		return p;
	}

}
