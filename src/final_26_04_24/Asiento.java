package final_26_04_24;

import java.util.ArrayList;

public class Asiento {
	private int id;
	private ArrayList<String> facilidades;
	private boolean disponible;

	public Asiento(int id) {
		this.id = id;
		this.facilidades = new ArrayList<>();
		this.disponible = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public void addFacilidad(String f) {
		if (!this.facilidades.contains(f)) {
			this.facilidades.add(f);
		}
	}

	public ArrayList<String> getFacilidades() {
		return new ArrayList<String>(this.facilidades);
	}

}
