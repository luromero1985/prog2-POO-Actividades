package final_26_04_24;

import java.util.ArrayList;

public class Asiento extends Tren {

	private int id;
	private ArrayList<String> facilidades;
	private boolean libre;

	public Asiento(String n, int id) {
		super(n);
		this.id = id;
		this.facilidades = new ArrayList<>();
		this.libre = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public void addFacilidad(String f) {
		if (!this.facilidades.contains(f)) {
			this.facilidades.add(f);
		}
	}

	@Override
	public int cantAsientos() {
		return 1;
	}

	@Override
	public void asignarAsiento(Filtro f) {
		if (this.isLibre()) {
			this.setLibre(false);
		}
	}

	@Override
	public Tren getCopia(Filtro f) {

		Asiento copia = new Asiento(this.getNombre(), this.getId());
		if (!this.facilidades.isEmpty()) {
			ArrayList<String> copiaFacilidades = new ArrayList<>(this.facilidades);

			for (String facilidad : copiaFacilidades) {
				copia.addFacilidad(facilidad);
			}
		}
		return copia;
	}
}
