package recuperatorio2023;

import java.util.ArrayList;

public class BloqueIterativo extends Bloque {
	private int cantIteraciones;

	
	public BloqueIterativo(int iteraciones) {
		super();
		this.cantIteraciones=iteraciones;
	}
	
	
	public int getCantIteraciones() {
		return cantIteraciones;
	}


	public void setCantIteraciones(int cantIteraciones) {
		this.cantIteraciones = cantIteraciones;
	}
	
	@Override 
	public int getGastoBateria() {
		return super.getGastoBateria()*this.getCantIteraciones();
	}
	
	@Override
	
	public int getTiempoEjecucion() {
		return super.getTiempoEjecucion()*this.getCantIteraciones();
	}
	
	@Override
	public ArrayList<String>listaInstrucciones(){
		ArrayList<String> comandosIteracion=super.listaInstrucciones();
		ArrayList<String>comandos=new ArrayList<>();
		for(int i=0;i<this.getCantIteraciones(); i++ ) {
			comandos.addAll(comandosIteracion);
		}
		return comandos;
		}
	
	@Override 
	public Bloque crearObjeto() {
		return new BloqueIterativo(this.cantIteraciones);
	}
	}
