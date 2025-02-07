package final_1_03_24;

import java.util.ArrayList;

public class Elemento extends Comida{

	private int tiempoPreparac;
	private int calorias;
	private double precio;
	
	public Elemento(String nombre, String tipo, String modoPreparac, int tiempoPreparac, int calorias, double precio) {
		super(nombre, tipo, modoPreparac);
		this.tiempoPreparac = tiempoPreparac;
		this.calorias = calorias;
		this.precio = precio;
	}

	public int getTiempoPreparac() {
		return tiempoPreparac;
	}

	public void setTiempoPreparac(int tiempoPreparac) {
		this.tiempoPreparac = tiempoPreparac;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
	    return "Elemento: " + this.getNombre() + 
	           " | Tiempo: " + this.getTiempoPreparac() + " min" +
	           " | Calorías: " + this.getCalorias() +
	           " | Precio: $" + this.getPrecio();
	}

	
	
}
	
