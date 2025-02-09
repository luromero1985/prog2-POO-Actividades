package final_26_04_24;

import java.util.ArrayList;

public class Pasajero {
private String nombre;
private int edad;
private ArrayList<String>preferencias;


public Pasajero(String nombre, int edad) {
	this.nombre = nombre;
	this.edad = edad;
	this.preferencias = new ArrayList<String> ();
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public void addPreferencia(String p) {
	if(!this.preferencias.contains(p)) {
		this.preferencias.add(p);
	}
}

public ArrayList<String> getPreferencia(){
	return new ArrayList<String>(this.preferencias);
}
}
