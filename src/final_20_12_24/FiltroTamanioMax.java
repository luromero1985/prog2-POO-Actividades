package final_20_12_24;


public class FiltroTamanioMax extends Filtro {
private int tamanio;

public FiltroTamanioMax (int tamanio) {
	this.tamanio=tamanio;
}

public boolean cumple(Elemento d) {
	return this.tamanio<d.getTamanio();
}
}
