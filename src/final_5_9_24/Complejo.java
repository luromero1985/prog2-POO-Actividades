package final_5_9_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Complejo extends Categoria {

	private String descripcion;
	private ArrayList<Categoria> categorias;

	public Complejo(String nombre, String descripcion) {
		super(nombre);
		this.descripcion = descripcion;
		this.categorias = new ArrayList<>();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void addCategoria(Categoria c) { // controlo si esta?
		if (this.categorias.contains(c)) {
			this.categorias.add(c);
		}
	}

	@Override
	public Categoria getCopia(String palabra) {
		ArrayList<Categoria> elementos = new ArrayList<>();
		for (Categoria c : this.categorias) {
			if (c.getCopia(palabra) != null) {
				elementos.add(c);
			}
		}
		if (!elementos.isEmpty()) {
			Complejo copia = new Complejo(this.getNombre(), this.getDescripcion());
			for (Categoria cat : elementos) {
				copia.addCategoria(cat);
			}
			return copia;
		}
		return null;
	}

	public boolean tienePalabraClave(String p) {
		for (Categoria c : this.categorias) {
			if (c.tienePalabraClave(p)) {
				return true;
			}
		}
		return false;
	}

	public int getCantPalabrasClave() {
		int cantidad = 0;
		for (Categoria c : this.categorias) {
			cantidad += c.getCantPalabrasClave();
		}
		return cantidad;
	}

	public ArrayList<Marcador> getBuscar(Filtro f, Comparator<Marcador> c) {
		ArrayList<Marcador> resultado = new ArrayList<>();
		for (Categoria cat : this.categorias) {
			ArrayList<Marcador> hijo = cat.getBuscar(f, c);
			if (!hijo.isEmpty()) {
				for (Marcador h : hijo) {
					resultado.add(h);
				}
			}
		}
		Collections.sort(resultado, c);
		return resultado;
	}
	
	
	public int getCantidadMarcadores() {
		int cantidad = 0;
		for (Categoria c : this.categorias) {
			cantidad += c.getCantidadMarcadores();
		}
		return cantidad;
	}
	
	
	public ArrayList<String> getPalabrasClave() {
		ArrayList<String> resultado = new ArrayList<>();
		for (Categoria c : this.categorias) {
			for(String p: c.getPalabrasClave()) {
				if(!resultado.contains(p)) {
					resultado.add(p);
				}
			}
		}
		return resultado;
	}

}
