package Parcial2023;

import java.util.ArrayList;

public class Pieza3D extends Elemento {

	private int cantPLA;
	private String color;
	private int tiempoImpresion;


	public Pieza3D(String n, String d, int PLA, String c, int ti) {
		super(n,d);
		this.cantPLA=PLA;
		this.color=c;
		this.tiempoImpresion=ti;
	
	}



	@Override
	public int cantidadPLA() {
		return cantPLA;
	}



	public void setCantidadPLA(int cantPLA) {
		this.cantPLA = cantPLA;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getTiempoImpresion() {
		return tiempoImpresion;
	}



	public void setTiempoImpresion(int tiempoImpresion) {
		this.tiempoImpresion = tiempoImpresion;
	}

	@Override
	public ArrayList<String>listaColores(){
		ArrayList<String>lista=new ArrayList<>();
		lista.add(color);

		return lista;
	}

	@Override 
	public int cantidadPiezasSimples() {
		return 1;
	}

	@Override
	public String toString() {
		return "Pieza3D [nombre=" + this.getNombre() + ", descripcion=" + this.getDescripcion() + ", cantPLA=" + this.cantidadPLA() + ", color=" + this.getColor()
		+ ", tiempoImpresion=" + this.getTiempoImpresion() + "]";
	}

	public ArrayList<Pieza3D>buscar(Filtro f){
		ArrayList<Pieza3D> lista=new ArrayList<>();
		if(f.cumple(this)) {
			lista.add(this);
		}
		return lista;
	}

	
}
