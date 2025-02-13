package final_15_3_24;

import java.util.ArrayList;

public class SeleccionAzar extends Seleccion {

	@Override
	public int subCola(ArrayList<Estructura> estructuras) {
		int posicion= estructuras.size();
		return (int)(Math.random()*posicion);
	}

}
