package Parcial2023;

public class FiltroNOT {
	private Filtro filtro;

	public FiltroNOT(Filtro f) {
		this.filtro=f;
	}


	public boolean cumple(Elemento p) {
		return !filtro.cumple(p);
	}
}
