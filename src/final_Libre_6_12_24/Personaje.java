package final_Libre_6_12_24;

import java.util.ArrayList;
import java.util.Objects;

public class Personaje {

	private String nombre;
	private ArrayList<String> metalesFav;
	private double altura;
	private String habilidad;
	private boolean aptitud;

	public Personaje(String nombre, double altura, String habilidad) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.habilidad = habilidad;
		this.metalesFav = new ArrayList<>();
		this.aptitud = false;
	}

	public boolean isAptitud() {
		return aptitud;
	}

	public void setAptitud(boolean aptitud) {
		this.aptitud = aptitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public void addMetalFav(String mf) {
		if (this.metalesFav.contains(mf)) {
			this.metalesFav.add(mf);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		try {
		Personaje other = (Personaje) obj;
		return this.getNombre().equals(other.getNombre());
	}catch(Exception e) {
		return false;
	}
	
	}
	
	
	public boolean meGustaMental(String m) {
		if(this.metalesFav.contains(m)) {
			return true;
		}
		return false;
	}
}
