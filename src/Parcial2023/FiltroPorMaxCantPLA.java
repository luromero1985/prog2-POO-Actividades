package Parcial2023;

public class FiltroPorMaxCantPLA extends Filtro {

	private int cantPLA;
	
	public FiltroPorMaxCantPLA(int cant) {
	this.cantPLA=cant;
}
	
	public boolean cumple(Elemento p) {
		return p.cantidadPLA()<cantPLA;
	}
}
