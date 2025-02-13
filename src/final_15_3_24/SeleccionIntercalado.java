package final_15_3_24;

import java.util.ArrayList;

public class SeleccionIntercalado extends Seleccion {
	private int posicion;

	public SeleccionIntercalado() {
		this.posicion = 0;
	}

	@Override
	public int subCola(ArrayList<Estructura> estructuras) {
		if (this.posicion > estructuras.size()) {
			this.posicion = 0;
		}
		int aux = posicion;
		posicion = posicion + 1;
		return aux;
	}

}
