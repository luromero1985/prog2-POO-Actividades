package final_9_8_24;

import java.util.ArrayList;

public class Comida extends Menu{
	
	private int tiempoPreparacion;
	private double precio;
	private int calorias;
	private ArrayList<String>ingredientes;

	
	public Comida(String nombre, int tiempoPreparacion, double precio, int calorias) {
		super(nombre);
		this.tiempoPreparacion = tiempoPreparacion;
		this.precio = precio;
		this.calorias = calorias;
		this.ingredientes=new ArrayList<>();
	}
	
		
	public void addIngrediente(String ing) {
		if(!this.ingredientes.contains(ing)) {
			this.ingredientes.add(ing);
		}
	}

	@Override
	public ArrayList<String> listaIngredientes(){
		ArrayList<String> lista=new ArrayList<>();
		lista.addAll(this.ingredientes);
		return lista;
	}

	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}


	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCalorias() {
		return calorias;
	}


	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}


	public ArrayList<Menu>  buscar(Filtro f) {
		ArrayList<Menu> comidas=new ArrayList<>();
		if(f.cumple(this)) {
			comidas.add(this);
		}
		return comidas;
	}
}
