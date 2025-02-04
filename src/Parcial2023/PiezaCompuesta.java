package Parcial2023;

import java.util.ArrayList;

public class PiezaCompuesta extends Elemento{

	private ArrayList<Elemento> elem;
	private int extraPla;
	private int extraTiempo;
	
	public PiezaCompuesta(String n, String d){
		super(n,d);
		this.elem=new ArrayList<>();
		this.extraPla = 1;
		this.extraTiempo = 45;
	
	}

	
	public PiezaCompuesta(String n, String d, int extraPLA, int extraTiempo){
		super(n,d);
		this.elem=new ArrayList<>();	
		this.extraPla = extraPla;
		this.extraTiempo = extraTiempo;
	
	}

	
	
	public int getExtraPla() {
		return extraPla;
	}


	public void setExtraPla(int extraPla) {
		this.extraPla = extraPla;
	}


	public int getExtraTiempo() {
		return extraTiempo;
	}


	public void setExtraTiempo(int extraTiempo) {
		this.extraTiempo = extraTiempo;
	}


	public void addElemento(Elemento e) {
		this.elem.add(e);
	}

	/*
	 *  una cantidad de PLA necesario que se calcula como la suma del PLA necesario más
	 *   1 gramo por cada pieza simple que la compone
	 */

	@Override
	public int cantidadPLA() {
		int cantPLA=0; 
		for(Elemento elemento:elem) {
			cantPLA+=elemento.cantidadPLA();
		}
		return cantPLA+this.getExtraPla()*this.cantidadPiezasSimples();
	}


	@Override 
	public int cantidadPiezasSimples() {
		int cant=0;

		for(Elemento e: elem) {
			cant+=e.cantidadPiezasSimples();
		}
		return cant;
	}

	/*
	 * un tiempo estimado que es la suma de los tiempos de cada parte más 45 segundos extra.
	 */

	@Override
	public int getTiempoImpresion() {
		int tiempo=0;
		for(Elemento e: elem) {
			tiempo+=e.getTiempoImpresion();
		}
		return tiempo=+this.getExtraTiempo();
	}


	/*
	 * La pieza compuesta no posee un color propio, pero debe ser posible obtener la 
	 * lista de los colores de las piezas que lo componen (simples o compuestas), sin 
	 * repetidos.
	 * */

	@Override 
	public ArrayList<String>listaColores(){
		ArrayList<String>lista=new ArrayList<>();
		for(Elemento e: elem) {
			for(String color: e.listaColores()) {
				if(lista==null || !lista.contains(color)) {
					lista.add(color);
				}
			}
		}
		return lista;

	}

	@Override

	public ArrayList<Pieza3D>buscar(Filtro f){
		ArrayList<Pieza3D> lista=new ArrayList<>();
		for(Elemento e: elem) {
			if(e.buscar(f)!=null) {
				e.buscar(f).addAll(lista);
			}
		}
		return lista;
	}
	

}
