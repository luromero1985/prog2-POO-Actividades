package final_1_03_24;

public class FiltroPorModopreparacion extends Filtro {
private String modoP;

public FiltroPorModopreparacion(String mp) {
	this.modoP=mp;
}

public boolean cumple(Comida c) {
	return c.getModoPreparacion().equals(this.modoP);
}
}
