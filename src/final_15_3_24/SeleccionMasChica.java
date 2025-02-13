package final_15_3_24;

import java.util.ArrayList;

public class SeleccionMasChica extends Seleccion {

	@Override
	public int subCola(ArrayList<Estructura> estructuras) {
		int posicion = 0;

		for (int i = 0; i < estructuras.size(); i++) {
			if (estructuras.get(i).getCantidadElementos() < estructuras.get(posicion).getCantidadElementos()) {
				posicion = i;
			}
		}
		return posicion;
	}

}
