package final_1_12_23;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Tarea implements Comparable<Tarea>, Comparator<Tarea>{
	private String nombre;

	public Tarea(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract int getCantEmpleados();

	public abstract int getTiempo();

	public abstract ArrayList<Tarea> buscar(Filtro f, Comparator<Tarea> comparador);
	
	

//si lo hiciera con comparable y no con comparator, implemento comparable en Tarea

	public int compareTo(Tarea t) {
		int comparacion = this.nombre.compareTo(t.getNombre());

		if (comparacion == 0) {
			//return Integer.compare(this.getCantEmpleados(), t.getCantEmpleados());
			return this.getCantEmpleados()-t.getCantEmpleados();
		}
		return comparacion;
	}

	//no requiero de meter comparable como parametro, ya tarea sabe ordenarse con collections.sort
	public abstract ArrayList<Tarea> buscar(Filtro f);
	
	public abstract Tarea getCopia();

	
}
