package final_9_8_24;

public class FiltroPrecioMenor extends Filtro {
	private double precio;

	public FiltroPrecioMenor(double p) {
		this.precio=p;
	}
	@Override
	public boolean cumple(Menu menu) {
		return menu.getPrecio()<this.precio;
	}

}
