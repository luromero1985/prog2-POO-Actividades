package Parcial2023;

import java.util.ArrayList;

public class PiezaExclusiva extends Pieza3D {

	private int costoExclusividad;
	
	public PiezaExclusiva(String nombre, String descrip,int PLA, String color, int ti) {
		super(nombre, descrip, PLA, color, ti);
	}

	public int getCostoExclusividad() {
		return costoExclusividad;
	}

	public void setCostoExclusividad(int costoExclusividad) {
		this.costoExclusividad = costoExclusividad;
	}
	
	
	@Override 
	public ArrayList<Pieza3D>buscar(Filtro f){
		return  new ArrayList<Pieza3D>();
	}
	
	
	@Override 
	public int getCosto() {
		return super.getCosto()+getCostoExclusividad();
	}
	
	
}
