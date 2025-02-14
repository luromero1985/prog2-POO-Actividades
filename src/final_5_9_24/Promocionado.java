package final_5_9_24;

import java.util.ArrayList;
import java.util.Comparator;

public class Promocionado extends Marcador {

	public Promocionado(String nombre, String url, String nombreUsuario) {
		super(nombre, url, nombreUsuario);
	}

	@Override
	public ArrayList<Marcador> getBuscar(Filtro f, Comparator<Marcador> c) {
		ArrayList<Marcador> resultado = new ArrayList<>();

		resultado.add(this);

		return resultado;
	}
}
