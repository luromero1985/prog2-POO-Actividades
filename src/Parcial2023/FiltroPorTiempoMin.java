package Parcial2023;

public class FiltroPorTiempoMin {
private int tiempoMin;

public FiltroPorTiempoMin(int t) {
	this.tiempoMin=t;
}

public boolean cumple(Elemento p) {
	return p.getTiempoImpresion()>tiempoMin;
}
}
