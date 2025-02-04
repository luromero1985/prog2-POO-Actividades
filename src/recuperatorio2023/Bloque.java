package recuperatorio2023;

import java.util.ArrayList;

public class Bloque extends Tarjeta {
	private ArrayList<Tarjeta>comandos;
	private static int gastoExtraBateriaBloque=45;
	
	public Bloque() {
		this.comandos=new ArrayList<>();
	}

	
	public void addTarjeta(Tarjeta t) {
		comandos.add(t);
	}


	public static int getGastoExtraBateriaBloque() {
		return Bloque.gastoExtraBateriaBloque;
	}

	public static void setGastoExtraBateriaBloque(int gebb) {
		Bloque.gastoExtraBateriaBloque=gebb;
	}

	public int getTiempoEjecucion() {
		int tiempoTotal=0;
		for(Tarjeta comando: comandos) {
			tiempoTotal+=comando.getTiempoEjecucion();
		}
		return tiempoTotal;
	}

	public int getGastoBateria() {
		int mAh=0;
		for(Tarjeta comando: comandos) {
			mAh+=comando.getGastoBateria();
		}
		return mAh+Bloque.getGastoExtraBateriaBloque()*this.getTiempoEjecucion();
	}


	public int cantTarjetas() {
		int cant=0;
		for(Tarjeta comando: comandos) {
			cant+=comando.cantTarjetas();
		}
		return super.cantTarjetas()+cant;
	}

	public Tarjeta getCopia(Filtro f) {
		Bloque copiaBloque= this.crearObjeto();
		for(Tarjeta comando: comandos) {
			Tarjeta copia=comando.getCopia(f);
			if(copia!=null) {
				copiaBloque.addTarjeta(copia);
			}
		}
		if(copiaBloque.cantTarjetas()>1) {
			return copiaBloque;
		}else {
			return null;
		}
	}
	

	public Bloque crearObjeto() {
		return new Bloque();
	}
	
	
	public ArrayList<String>listaInstrucciones(){
		ArrayList<String> lista=new ArrayList<>();
		for(Tarjeta comando: comandos) {
			lista.addAll(comando.listaInstrucciones());
		}
		return lista;
	}
	

}
