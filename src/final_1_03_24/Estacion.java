package final_1_03_24;

import java.util.ArrayList;

public class Estacion {
private String nombre;
private ArrayList<Comida>comidasDesignadas;
private ArrayList<Comida> enElaboracion;  
private static Filtro filtro;

public Estacion(String nombre, Filtro f) {
	this.nombre=nombre;
	Estacion.filtro=f;
	this.comidasDesignadas=new  ArrayList<>();
	this.enElaboracion=new  ArrayList<>();
}

public String getNombre() {
	return this.nombre;
}


public static Filtro getFiltro() {
	return Estacion.filtro;
}

public static void setFiltro(Filtro filtro) { //aca permite hacer el cambio en tiempo de ejecucion
	Estacion.filtro = filtro;
}

public void setNombre(String nombre) {
	this.nombre=nombre;
}

public void addComidasDesignadas(Comida c) {
	 	if(!comidasDesignadas.contains(c) && Estacion.getFiltro().cumple(c)) {
		this.comidasDesignadas.add(c);
	}
}



public boolean puedoPreparar(Comida c) {
   return this.comidasDesignadas.contains(c) && Estacion.getFiltro().cumple(c);
}



	@Override
	public boolean equals(Object o) {
		Estacion otro= (Estacion)o;
		try {
			return this.getNombre().equals(otro.getNombre());
		} catch(Exception e) {
			return false;
		}
	}


	public void elaboracionAsignada(Comida c) {
        this.enElaboracion.add(c);  // ALMACENA LAS COMIDAS EN LA LISTA
    }

    public ArrayList<Comida> getEnElaboracion() {
        return new ArrayList<>(this.enElaboracion); //  DEVUELVE UNA COPIA SEGURA
    }
}