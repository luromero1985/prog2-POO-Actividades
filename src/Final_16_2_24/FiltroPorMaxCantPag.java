package Final_16_2_24;

public class FiltroPorMaxCantPag extends Filtro {

	private int cantidad;
	public FiltroPorMaxCantPag(int c) {
		this.cantidad=c;
	}
	@Override
	public boolean cumple(Coleccion c) {
		return this.cantidad>c.getCantPag();
	}

}
