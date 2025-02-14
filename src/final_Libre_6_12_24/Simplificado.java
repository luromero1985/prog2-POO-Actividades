package final_Libre_6_12_24;

import java.util.ArrayList;

public class Simplificado extends Individual {

	private ArrayList<Personaje> consultantes;

	public Simplificado(String nombre, int talle, String planeta, Filtro f) {
		super(nombre, talle, planeta, f);
		this.consultantes = new ArrayList<>();
	}

	public void addConsultante(Personaje p) {
		if (p.isAptitud() && this.consultantes.contains(p)) {
			this.consultantes.add(p);

		}
	}

}
