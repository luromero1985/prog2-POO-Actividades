package final_9_8_24;

import java.util.ArrayList;

public class Compuesto extends Menu {

	private ArrayList<Menu> menues;
	private static double descuento = 0.1;

	public Compuesto(String nombre) {
		super(nombre);
		this.menues = new ArrayList<>();
	}

	public void addMenu(Menu m) {
		if (!this.menues.contains(m)) {
			menues.add(m);
		}
	}

	public static double getDescuento() {
		return Compuesto.descuento;
	}

	public static void setDescuento(double desc) {
		Compuesto.descuento = desc;
	}

	@Override
	public int getTiempoPreparacion() {
		int tiempoMayor = 0;
		for (Menu menu : menues) {
			if (menu.getTiempoPreparacion() > tiempoMayor) {
				tiempoMayor = menu.getTiempoPreparacion(); //puedo mejorar que no llame 2 veces comn un aux
			}
		}
		return tiempoMayor;
	}

	@Override
	public double getPrecio() {
		double precio = 0;
		for (Menu menu : menues) {
			precio += menu.getPrecio();
		}
		return precio - precio * getDescuento();
	}

	@Override
	public int getCalorias() {
		int calorias = 0;
		for (Menu menu : menues) {
			calorias += menu.getCalorias();
		}
		return calorias;
	}

	@Override
	public ArrayList<String> listaIngredientes() {
		ArrayList<String> lista = new ArrayList<>();
		for (Menu menu : menues) {
			for (String ingrediente : menu.listaIngredientes()) {
				if (!lista.contains(ingrediente)) {
					lista.add(ingrediente);
				}
			}
		}
		return lista;
	}

	public ArrayList<Menu> buscar(Filtro f) {
		ArrayList<Menu> comidas = new ArrayList<>();

		for (Menu menu : menues) {
			ArrayList<Menu> comidasHijo = menu.buscar(f);
			for (Menu hijo : comidasHijo) {
				comidas.addAll(hijo.buscar(f));
			}
		}

		return comidas;
	}

}
