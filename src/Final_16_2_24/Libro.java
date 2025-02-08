package Final_16_2_24;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro extends Coleccion {

	private ArrayList<Coleccion> colecciones;
	private LocalDate anioiPublic;

	public Libro(Persona e, String t, LocalDate anioiPublic) {
		super(e, t);
		this.anioiPublic = anioiPublic;
		this.colecciones = new ArrayList<>();
	}

	public LocalDate getAnioiPublic() {
		return anioiPublic;
	}

	public void setAnioiPublic(LocalDate anioiPublic) {
		this.anioiPublic = anioiPublic;
	}
	
	
	public void addColeccion(Coleccion c) {
		if(!this.colecciones.contains(c)) {
			this.colecciones.add(c);
		}
	}

	@Override
	public int getCantPag() {
		int cant = 0;
		for (Coleccion c : this.colecciones) {
			cant += c.getCantPag();
		}
		return cant;
	}

	@Override
	public Coleccion getCopia() {
		// TODO Auto-generated method stub
		return null;
	}

}
