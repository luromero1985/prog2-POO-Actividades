package final_9_8_24;

import java.util.ArrayList;

public abstract class Menu {

	private String nombre;

	public Menu(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract int getTiempoPreparacion();

	public abstract double getPrecio();

	public abstract int getCalorias();

	public abstract ArrayList<String> listaIngredientes();

	public abstract ArrayList<Menu> buscar(Filtro f);

}
