package final_Libre_6_12_24;

import java.util.ArrayList;

public class Adaptable extends Individual {

	public Adaptable(String nombre, int talle, String planeta, Filtro f) {
		super(nombre, talle, planeta, f);
		
	}

	@Override
	public ArrayList<Traje> trajesRecomendados(Personaje p) {
		ArrayList<Traje> trajes = new ArrayList<>();

		trajes.add(this);

		return trajes;
	}
}
