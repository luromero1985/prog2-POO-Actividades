package recuperatorio2023;

import java.util.ArrayList;

public class Comando extends Tarjeta {
	private String instruccion;
	private int gastoBateria;
	private int tiempoEjecucion;


	public Comando (String inst, int gb, int te) {
		this.instruccion=inst;
		this.gastoBateria=gb;
		this.tiempoEjecucion=te;
	}


	public String getInstruccion() {
		return instruccion;
	}


	public void setInstruccion(String instruccion) {
		this.instruccion = instruccion;
	}


	public int getGastoBateria() {
		return gastoBateria;
	}


	public void setGastoBateria(int gastoBateria) {
		this.gastoBateria = gastoBateria;
	}


	public int getTiempoEjecucion() {
		return tiempoEjecucion;
	}


	public void setTiempoEjecucion(int tiempoEjecucion) {
		this.tiempoEjecucion = tiempoEjecucion;
	}


	public Tarjeta getCopia(Filtro f) {
		if(f.cumple(this)) {
			Comando copia=new Comando(this.getInstruccion(), this.getGastoBateria(), this.getTiempoEjecucion());
			return copia;
		}else {
			return null;
		}
	}

	public ArrayList<String>listaInstrucciones(){
		ArrayList<String> lista=new ArrayList<>();
		lista.add(this.getInstruccion());
		return lista;
	}
	
	}


