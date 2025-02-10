package final_26_04_24;

import java.util.ArrayList;

public class Seccion extends Tren {

	private ArrayList<Tren> trenes;

	public Seccion(String n) {
		super(n);
		this.trenes = new ArrayList<>();
	}

	public void addTren(Tren t) {
		if (!this.trenes.contains(t)) {
			this.trenes.add(t);
		}
	}

	public ArrayList<Tren> getTrenes() {
		return new ArrayList<Tren>(this.trenes);
	}

	@Override
	public int cantAsientosDisponibles() {
		int cantidad = 0;
		for (Tren t : this.trenes) {
			cantidad += t.cantAsientosDisponibles();
		}
		return cantidad;
	}

	@Override
	public Tren getCopia() {
		Seccion copia = new Seccion(this.getNombre());

		for (Tren t : this.trenes) {
			Tren hijo = t.getCopia();
			if (hijo != null) {
				copia.addTren(hijo);
			}
		}

		if (!copia.getTrenes().isEmpty()) {
			return copia;
		} else {
			return null;
		}

	}

	@Override
	public boolean asignarAsiento(Pasajero pasajero, Filtro filtro) {
		for (Tren t : this.trenes) {
			if (t.asignarAsiento(pasajero, filtro)) {
				return true; // Se asignó en alguna parte de la sección
			}
		}
		return false;
	}

	@Override
	public ArrayList<Asiento> getAsientosDisponibles(Pasajero p, Filtro f) {
		ArrayList<Asiento> disponibles = new ArrayList<>();
		for (Tren t : this.trenes) {
			disponibles.addAll(t.getAsientosDisponibles(p, f));
		}
		return disponibles;
	}
}
