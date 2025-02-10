package final_26_04_24;

import java.util.ArrayList;

public abstract class Tren {

	private String nombre;
	
	public Tren(String n) {
		this.nombre=n;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean equals(Object o) {
		try {
			Tren otro =(Tren)o;
			return this.getNombre().equals(otro.getNombre());
		}catch(Exception e) {
			return false;
		}
	}
	
	public abstract int cantAsientosDisponibles();
	
	public abstract Tren getCopia(); 
	
    public abstract boolean asignarAsiento(Pasajero pasajero, Filtro filtro);

    public abstract ArrayList<Asiento> getAsientosDisponibles(Pasajero pasajero, Filtro filtro);
    }


}
