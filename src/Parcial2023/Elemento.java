package Parcial2023;

import java.util.ArrayList;

public abstract class Elemento {

	private String nombre;
	private String descripcion;
	private  static int precioGramo=12;
    private  static int costoSegundo=45;


	public Elemento(String n, String d) {
		this.nombre=n;
		this.descripcion=d;

	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public abstract int cantidadPLA();
	public abstract int cantidadPiezasSimples();
	public abstract int getTiempoImpresion();
	public abstract ArrayList<String>listaColores();

	public abstract ArrayList<Pieza3D>buscar(Filtro f);
	public int getCosto() {
		return this.cantidadPLA()*Elemento.getPrecioGramo()+
				this.getTiempoImpresion()*Elemento.getCostoSegundo();
	}

	public static int getPrecioGramo() {
		return precioGramo;
	}
	public static void setPrecioGramo(int precioGramo) {
		Elemento.precioGramo = precioGramo;
	}
	public static int getCostoSegundo() {
		return costoSegundo;
	}
	public static void setCostoSegundo(int costoSegundo) {
		Elemento.costoSegundo = costoSegundo;
	}


}
