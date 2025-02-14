package final_Libre_6_12_24;

import java.util.ArrayList;

public class EquipoTactico extends Traje {

	protected ArrayList<Traje> trajes;

	public EquipoTactico(String nombre) {
		super(nombre);
		this.trajes = new ArrayList<>();
	}

	public void addTrajes(Traje t) {
		if (this.trajes.contains(t)) {
			this.trajes.add(t);
		}
	}

	@Override
	public int getTalle() {
		int talle = Integer.MAX_VALUE;
		for (Traje t : this.trajes) {
			int aux = t.getTalle();
			if (aux < talle) {
				talle = aux;
			}
		}
		return talle;
	}

	@Override
	public ArrayList<String> getMetalesUsados() {
		ArrayList<String> metales = new ArrayList<>();

		for (Traje t : this.trajes) {

			ArrayList<String> hijo = t.getMetalesUsados();
			for (String m : hijo) {
				if (metales.contains(m)) {
					metales.add(m);
				}
			}
		}
		return metales;
	}

	@Override
	public ArrayList<Traje> trajesRecomendados(Personaje p) {

		ArrayList<Traje> trajes = new ArrayList<>();

		for (Traje t : this.trajes) {
			ArrayList<Traje> trajesHijos = t.trajesRecomendados(p);
			trajes.addAll(trajesHijos);
		}
		return trajes;
	}

	
	@Override

	public Traje getCopia(Modificador m) {
		EquipoTactico copia = new EquipoTactico(this.getNombre());
		
		for (Traje t: this.trajes) {
			Traje hijo= t.getCopia(m);
			copia.addTrajes(hijo);;
		}
		return copia;
	}

}
