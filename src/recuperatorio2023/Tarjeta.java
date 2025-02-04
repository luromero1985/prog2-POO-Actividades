package recuperatorio2023;

import java.util.ArrayList;

public abstract class Tarjeta {

	public abstract int getTiempoEjecucion();
	public abstract int getGastoBateria();
	public abstract Tarjeta getCopia(Filtro f);
	public abstract ArrayList<String>listaInstrucciones();
	
	public int cantTarjetas() {
		return 1;
	}
}
