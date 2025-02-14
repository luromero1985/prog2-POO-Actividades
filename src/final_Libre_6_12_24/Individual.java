package final_Libre_6_12_24;

import java.util.ArrayList;

public class Individual extends Traje {

	private int talle;
	private ArrayList<String> metalesUsados;
	private String planeta;
	private Filtro filtro;

	public Individual(String nombre, int talle, String planeta, Filtro f) {
		super(nombre);
		this.talle = talle;
		this.planeta = planeta;
		this.metalesUsados = new ArrayList<>();
		this.filtro = f;
	}

	public int getTalle() {
		return talle;
	}

	public void setTalle(int talle) {
		this.talle = talle;
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	public Filtro getFiltro() {
		return filtro;
	}

	public void setFiltro(Filtro filtro) {
		this.filtro = filtro;
	}

	public void addMetalUsado(String m) {
		if (this.metalesUsados.contains(m)) {
			this.metalesUsados.add(m);
		}
	}

	@Override
	public ArrayList<Traje> trajesRecomendados(Personaje p) {
		ArrayList<Traje> trajes = new ArrayList<>();
		if (this.filtro.cumple(p)) {
			trajes.add(this);
		}
		return trajes;
	}

	
	
	@Override
	public Traje getCopia(Modificador m) {
		Individual copia = new Individual(this.getNombre(), this.getTalle(), this.getPlaneta(), this.getFiltro());
		
		for (String metal : this.metalesUsados) {
			copia.addMetalUsado(metal);
		}
		
		m.transformar(copia);
		return copia;
	}

}
