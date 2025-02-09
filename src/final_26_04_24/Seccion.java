package final_26_04_24;

import java.util.ArrayList;

public class Seccion extends Tren {

	private ArrayList<Tren> trenes;

	public Seccion(String n) {
		super(n);
		this.trenes = new ArrayList<>();
	}

	public void addTren(Tren t) {
		if (this.trenes.contains(t)) {
			this.trenes.add(t);
		}
	}

	public ArrayList<Tren> getTrenes() {
		return new ArrayList<Tren>(this.trenes);
	}

	@Override
	public int cantAsientos() {
		int cantidad = 0;
		for (Tren t : this.trenes) {
			cantidad += t.cantAsientos();
		}
		return cantidad;
	}

	@Override
	public Tren getCopia(Filtro f) {
		Seccion copia = new Seccion(this.getNombre());

		for (Tren t : this.trenes) {
			Tren hijo = t.getCopia(f);
			if (hijo != null) {
				copia.addTren(t);
			}
		}

		if (!copia.getTrenes().isEmpty()) {
			return copia;
		} else {
			return null;
		}
	}

	@Override
	public void asignarAsiento(Filtro f) {
		for(Tren t: this.trenes) {
			if(t.) {
				t.asignarAsiento(f);
			}
		}
	}
}
