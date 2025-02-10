package final_9_8_24;

import java.util.ArrayList;

public class CompuestoRestringido extends Compuesto{

	private Filtro filtro; // strategy
	private ArrayList<Menu> menues;
	
	public CompuestoRestringido(String nombre, Filtro f) {
		super(nombre);
		this.filtro = f;
		this.menues = new ArrayList<>();
	}
	
	
	public Filtro getFiltro() {
		return this.filtro;
	}

	public void setFiltro(Filtro f) {
		this.filtro = f;
	}

	
	public void addMenu(Menu m) {
		if (!this.menues.contains(m) && this.filtro.cumple(m) ) {
			menues.add(m);
			}
}
}
