package final_26_04_24_otraForma;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	private ArrayList<String> preferencias;

	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
		this.preferencias = new ArrayList<>();
	}

	public void addPreferencia(String p) {
		if(!this.preferencias.contains(p)) {
			this.preferencias.add(p);
		}
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setEdad(int ed) {
		this.edad=ed;
	}

	public int getEdad() {
		return this.edad;
	}
	public ArrayList<String> getPreferencias(){
		return new ArrayList<>(this.preferencias);
	}
}
