package final_9_8_24;

import java.util.ArrayList;

public abstract class Menu {

	public abstract int getTiempoPreparacion();
	public abstract double getPrecio();
	public abstract int getCalorias();
	public abstract ArrayList<String> listaIngredientes();
	public abstract ArrayList<Menu> buscar(Filtro f);



}
