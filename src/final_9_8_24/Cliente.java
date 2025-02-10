package final_9_8_24;

import java.util.ArrayList;

public class Cliente {
private String nombre;
private ArrayList<Menu> comidaSolicitada;
private int caloriasMax;
private Filtro preferencias;



public Cliente(String n, int calMax, Filtro p) {
	this.nombre=n;
	this.caloriasMax=calMax;
	this.comidaSolicitada=new ArrayList<>();
	this.preferencias=p;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public int getCaloriasMax() {
	return caloriasMax;
}



public void setCaloriasMax(int caloriasMax) {
	this.caloriasMax = caloriasMax;
}

public Filtro getPreferencias() {
	return preferencias;
}



public void setPreferencias(Filtro preferencias) {
	this.preferencias = preferencias;
}



public void addComidaSolicitada(Menu c) {
	if(!this.comidaSolicitada.contains(c)) {
		this.comidaSolicitada.add(c);
	}
	
}

public ArrayList<Menu> getComidasSolicitadas(){
	return new ArrayList<Menu>(this.comidaSolicitada); 
}
	

public boolean yaLoPedi(Menu c) {
	return this.comidaSolicitada.contains(c);
}

	public boolean leGusta(Menu c) {
		return this.preferencias.cumple(c);
	}
}



