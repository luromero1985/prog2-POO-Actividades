package final_1_03_24;

import java.util.ArrayList;

public class Compuesta extends Comida {

	private ArrayList<Comida> menu;

	public Compuesta(String nombre, String tipo, String modoPreparac) {
		super(nombre, tipo, modoPreparac);
		this.menu = new ArrayList<>();
	}

	public void addMenu(Comida c) {
		if (!menu.contains(c)) { // debo definir equals en Comida
			menu.add(c);
		}
	}

	public int getCalorias() {
		int caloria = 0;
		for (Comida comida : menu) {
			caloria += comida.getCalorias();
		}
		return caloria;
	}

	public int getTiempoPreparac() {
		int tiempo = 0;
		for (Comida comida : menu) {
			tiempo += comida.getTiempoPreparac();
		}
		return tiempo;
	}
	
	public double getPrecio() {
		 	int precio = 0;
			for (Comida comida : menu) {
				precio += comida.getPrecio();
			}
			return precio;
		}
	}
}
