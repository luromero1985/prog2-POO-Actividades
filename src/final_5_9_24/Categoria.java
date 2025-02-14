package final_5_9_24;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Categoria {
	private String nombre;

	public Categoria(String nombre) {

		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean equals(Object o) {
		try {
			Categoria otra = (Categoria) o;
			return this.getNombre().equals(otra.getNombre());
		} catch (Exception e) {
			return false;
		}

	}

	public abstract Categoria getCopia(String palabra);

	public abstract boolean tienePalabraClave(String p);

	public abstract ArrayList<Marcador> getBuscar(Filtro f, Comparator<Marcador> c);

	public abstract int getCantPalabrasClave();

	public abstract int getCantidadMarcadores();

	public abstract ArrayList<String> getPalabrasClave();
}
