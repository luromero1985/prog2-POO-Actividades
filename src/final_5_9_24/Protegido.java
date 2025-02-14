package final_5_9_24;

import java.util.ArrayList;
import java.util.Comparator;

public class Protegido extends Marcador {

	public Protegido(String nombre, String url, String nombreUsuario) {
		super(nombre, url, nombreUsuario);
	}

	
	@Override
	public Categoria getCopia(String palabra) {
		return null;
	}
	
	
	
	public ArrayList<Marcador> getBuscar(Filtro f, Comparator<Marcador> c) {
		return new ArrayList<>();
		
	}

}
