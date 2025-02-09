package Final_16_2_24;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro extends Coleccion {

	private ArrayList<Coleccion> colecciones;
	private LocalDate anioiPublic;

	public Libro(Persona e, String t, Calculador c, LocalDate anioiPublic) {
		super(e, t, c);
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
		if (!this.colecciones.contains(c)) {
			this.colecciones.add(c);
		}
	}

	public ArrayList<Coleccion> getColecciones(){
		return new ArrayList<>(this.colecciones);
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
	public ArrayList<Persona> getAutores() {
		ArrayList<Persona> autores = new ArrayList<>();
		for (Coleccion c : this.colecciones) {
			for (Persona a : c.getAutores()) {
				if (!autores.contains(a)) {
					autores.add(a);
				}
			}
		}
		return autores;
	}

	@Override
	public Coleccion getCopia(Filtro f) {
		Libro copia = new Libro(this.getEditor(), this.getTitulo(), this.getCalculador(), this.getAnioiPublic());
		for (Coleccion c : this.colecciones) {
			Coleccion hijo = c.getCopia(f);
			if (hijo != null) {
				copia.addColeccion(hijo);
			}
		}
		if (!copia.getColecciones().isEmpty()) {
			return copia;
		} else {
			return null;
		}
	}

	@Override
	public int getPrecio() {
		int total = 0;
		for (Coleccion c : colecciones) {
			total += c.getPrecio();
		}
		return total;
	}
	

}
