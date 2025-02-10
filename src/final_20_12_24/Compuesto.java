package final_20_12_24;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compuesto extends Elemento {

	protected ArrayList<Elemento> elementos;

	public Compuesto(String n, LocalDate fc) {
		super(n, fc);
		this.elementos = new ArrayList<>();
	}

	public void addElemento(Elemento d) {
		if (!this.elementos.contains(d)) {
			this.elementos.add(d);
		}
	}

	@Override
	public int getTamanio() {
		int tamanio = 0;
		for (Elemento d : this.elementos) {
			tamanio += d.getTamanio();
		}
		return tamanio;
	}

	@Override
	public ArrayList<Elemento> getBuscar(Filtro f) {
		ArrayList<Elemento> resultado = new ArrayList<>();

		for (Elemento d : this.elementos) {
			for (Elemento hijo : d.getBuscar(f)) {
				if (!resultado.contains(hijo)) {
					resultado.add(hijo);
				}
			}
		}
		return resultado;
	}
}
