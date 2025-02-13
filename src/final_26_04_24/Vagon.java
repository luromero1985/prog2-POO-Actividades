package final_26_04_24;

import java.util.ArrayList;

public class Vagon extends Tren {

	private ArrayList<Asiento> asientos;

	public Vagon(String n) {
		super(n);
		this.asientos = new ArrayList<>();

	}

	public void addAsiento(Asiento a) {
		if (!this.asientos.contains(a)) {
			this.asientos.add(a);
		}
	}

	/*
	 * public ArrayList<Asiento> getAsiento() { return new
	 * ArrayList<>(this.asientos); }
	 */
	@Override
	public int cantAsientosDisponibles() {

		int cantidad = 0;
		for (Asiento asiento : this.asientos) {
			if (asiento.isDisponible()) {
				cantidad++;
			}
		}
		return cantidad;
	}

	@Override
	public Tren getCopia(Filtro f) {
		if (!this.asientos.isEmpty()) {
			ArrayList<Asiento> asientosFiltrados = new ArrayList<>();
			for (Asiento asiento : this.asientos) {
				if (!asiento.isDisponible() && f.cumple(asiento.getPasajero())) {
					asientosFiltrados.add(asiento);
				}
			}
			if (!asientosFiltrados.isEmpty()) {
				Vagon copia = new Vagon(this.getNombre());
				for (Asiento a : asientosFiltrados) {
					copia.addAsiento(a);
				}

				return copia;
			} else {
				return null;
			}
		}
		return null;
	}

	@Override
	public boolean asignarAsiento(Pasajero pasajero, Filtro filtro) {
		for (Asiento asiento : this.asientos) {
			if (asiento.isDisponible() && filtro.cumple(pasajero)&& cumplePreferencias(asiento, pasajero)) {
				asiento.setDisponible(false);
				return true; // Asignación exitosa
			}
		}
		return false; // No se encontró asiento disponible
	}


	private boolean cumplePreferencias(Asiento asiento, Pasajero pasajero) {
		for (String preferencia : pasajero.getPreferencias()) {
			if (!asiento.getFacilidades().contains(preferencia)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public ArrayList<Asiento> getAsientosDisponibles(Pasajero p, Filtro f) {
		ArrayList<Asiento> disponibles = new ArrayList<Asiento>();
		for (Asiento asiento : this.asientos) {
			if (asiento.isDisponible() &&  f.cumple(p)&& cumplePreferencias(asiento, p)) {
				disponibles.add(asiento);
			}
		}
		return disponibles;
	}
}
