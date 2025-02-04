package Parcial2023;

public class FiltroAND {
private Filtro filtro1, filtro2;

public FiltroAND(Filtro f1, Filtro f2) {
	this.filtro1=f1;
	this.filtro2=f2;
}


public boolean cumple(Elemento p) {
	return filtro1.cumple(p) && filtro2.cumple(p);
}
}
