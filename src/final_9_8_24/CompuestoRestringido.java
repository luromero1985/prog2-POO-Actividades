package final_9_8_24;

import java.util.ArrayList;

public class CompuestoRestringido extends Compuesto{

	private Filtro filtro; // strategy
	
	
	public CompuestoRestringido(String nombre, Filtro f) {
		super(nombre);
		this.filtro = f;

	}
	
	
	public Filtro getFiltro() {
		return this.filtro;
	}

	public void setFiltro(Filtro f) {
		this.filtro = f;
	}
	
	   @Override
	    public void addMenu(Menu m) {
	        if (this.filtro.cumple(m)) {
	            super.addMenu(m); 
	        }
	    }
}
