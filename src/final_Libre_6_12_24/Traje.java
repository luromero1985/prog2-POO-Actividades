package final_Libre_6_12_24;

import java.util.ArrayList;

public abstract class Traje {
	private String nombre;
	

	public Traje(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Traje other = (Traje) obj;
			return this.getNombre().equals(other.getNombre());
		} catch (Exception e) {
			return false;
		}
	}

	public abstract int getTalle();

	public abstract ArrayList<String> getMetalesUsados();
	
	public abstract  ArrayList<Traje> trajesRecomendados(Personaje p);
	
	
	public abstract Traje getCopia(Modificador m);
	

}
