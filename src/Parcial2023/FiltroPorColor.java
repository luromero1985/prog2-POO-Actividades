package Parcial2023;

public class FiltroPorColor extends Filtro{
private String color;

public FiltroPorColor(String c) {
	this.color=c;
}


public boolean cumple(Elemento p) {
	return p.listaColores().contains(this.color);
}
}
