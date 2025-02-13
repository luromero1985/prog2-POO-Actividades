package final_26_04_24;

import java.util.ArrayList;

public class SistemaTrenes {
	private ArrayList<Tren> trenesDisponibles;

	public SistemaTrenes() {
		this.trenesDisponibles = new ArrayList<>();
	}

	public void agregarTren(Tren tren) {
		if (!this.trenesDisponibles.contains(tren)) {
			this.trenesDisponibles.add(tren);
		}
	}

	public ArrayList<Asiento> getAsientosDisponibles(Pasajero pasajero, Filtro filtro) {
		ArrayList<Asiento> disponibles = new ArrayList<>();
		for (Tren tren : trenesDisponibles) {
			disponibles.addAll(tren.getAsientosDisponibles(pasajero, filtro));
		}
		return disponibles;
	}

	public boolean asignarAsiento(Pasajero pasajero, Filtro filtro) {
		for (Tren tren : trenesDisponibles) {
			if (tren.asignarAsiento(pasajero, filtro)) {
				return true;
			}
		}
		return false;
	}

	public int totalAsientos() {
		int total = 0;
		for (Tren tren : trenesDisponibles) {
			total += tren.cantAsientosDisponibles();
		}
		return total;
	}

	public SistemaTrenes filtrarSistemaPorPasajeros(Filtro criterio) {
		SistemaTrenes sistemaFiltrado = new SistemaTrenes();

		for (Tren tren : trenesDisponibles) {
			Tren trenFiltrado = tren.getCopia(criterio);
			if (trenFiltrado != null) {
				sistemaFiltrado.agregarTren(trenFiltrado);
			}
		}
		return sistemaFiltrado;
	}
}