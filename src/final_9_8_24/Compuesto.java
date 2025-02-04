package final_9_8_24;

import java.util.ArrayList;


public class Compuesto extends Menu{

	private ArrayList<Menu> menues;
	private static double descuento=0.1;
	private Filtro filtro; //strategy

	public Compuesto(Filtro f) {
		this.filtro=f;
		this.menues=new ArrayList<>();
	}


	public Compuesto() {
		this.menues=new ArrayList<>();
	}


	public Filtro getFiltro() {
		return this.filtro;
	}

	public void setFiltro(Filtro f) {
		this.filtro=f;	
	}



	public void addMenu(Menu m) {
		if(this.filtro==null) {
			menues.add(m);
		}
		else {
			if(this.filtro.cumple(m)) {
				menues.add(m);
			}
		}
	}

	
	public static double getDescuento() {
		return Compuesto.descuento;
	}

	public static void setDescuento(double desc) {
		Compuesto.descuento=desc;
	}

	@Override
	public int getTiempoPreparacion() {
		int tiempoMayor=0;
		for(Menu menu: menues) {
			if(menu.getTiempoPreparacion()>tiempoMayor) {
				tiempoMayor=menu.getTiempoPreparacion();
			}
		}
		return tiempoMayor;
	}


	@Override
	public double getPrecio() {
		int precio=0;
		for(Menu menu: menues) {
			precio+=menu.getPrecio();
		}
		return precio-precio*getDescuento();
	}

	@Override
	public int getCalorias() {
		int calorias=0;
		for(Menu menu: menues) {
			calorias+=menu.getCalorias();
		}
		return calorias;
	}

	@Override
	public ArrayList<String> listaIngredientes(){
		ArrayList<String> lista=new ArrayList<>();
		ArrayList<String>aux=new ArrayList<>();
		for(Menu menu: menues) {
			for(String ingrediente: menu.listaIngredientes()) {
				if(!aux.contains(ingrediente)){
					aux.add(ingrediente);
				}
			}
		}
		lista.addAll(aux);
		return lista;
	}


	public ArrayList<Menu>  buscar(Filtro f) {
		ArrayList<Menu> comidas=new ArrayList<>();
	
		for(Menu menu: menues) {
			ArrayList<Menu> comidasHijo=menu.buscar(f);
			for(Menu hijo: comidasHijo) {
				comidas.addAll(hijo.buscar(f));
			}
		}

		return comidas;
	}


}
