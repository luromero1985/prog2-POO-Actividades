package final_20_12_24;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {

	private String nombre;
	private LocalDate fechaCreac;

	public Elemento(String nombre, LocalDate fc) {
		this.nombre = nombre;
		this.fechaCreac = fc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaCreac() {
		return fechaCreac;
	}

	public void setFechaCreac(LocalDate fechaCreac) {
		this.fechaCreac = fechaCreac;
	}

	@Override
	public boolean equals(Object o) {
		try {
			Elemento otro = (Elemento) o;
			return this.getFechaCreac().equals(otro.getFechaCreac()) && this.getNombre().equals(otro.getNombre());
		} catch (Exception e) {
			return false;
		}
	}
	
	public abstract int getTamanio();
	
	public abstract ArrayList<Elemento> getBuscar(Filtro f);
}
