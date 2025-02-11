package Final_16_2_24;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro extends Coleccion {

	private ArrayList<Coleccion> colecciones;
	private LocalDate anioPublic;

	public Libro(Persona e, String t, LocalDate anioPublic) {
		super(e, t);
		this.anioPublic = anioPublic;
		this.colecciones = new ArrayList<>();
	}

	public LocalDate getAnioiPublic() {
		return anioPublic;
	}

	public void setAnioPublic(LocalDate anioiPublic) {
		this.anioPublic = anioiPublic;
	}

	public void addColeccion(Coleccion c) {
		if (!this.colecciones.contains(c)) {
			this.colecciones.add(c);
		}
	}

	/*
	 * public ArrayList<Coleccion> getColecciones() { return new
	 * ArrayList<>(this.colecciones); }
	 */
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
		ArrayList<Coleccion> elem = new ArrayList<>();

		for (Coleccion c : this.colecciones) {
			Coleccion hijo = c.getCopia(f);
			if (f.cumple(hijo)) {
				elem.add(hijo);
			}
		}
		if (!elem.isEmpty()) {
			Libro copia = new Libro(this.getEditor(), this.getTitulo(), this.getAnioiPublic());
			for (Coleccion e : elem) {
				copia.addColeccion(e);
			}
			return copia;
		}
		return null;
	}

	@Override
	public int getPrecio() {
		int total = 0;
		for (Coleccion c : colecciones) {
			total += c.getPrecio();
		}
		return total;
	}

	public boolean esAutor(Persona p) {
		for (Coleccion c : this.colecciones) {
			if (c.esAutor(p)) {
				return true;
			}
		}
		return false;
	}
}
