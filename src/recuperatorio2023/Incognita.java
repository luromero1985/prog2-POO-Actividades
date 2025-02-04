package recuperatorio2023;

import java.util.ArrayList;

public class Incognita extends Comando {
	public Incognita(String inst, int gb, int te) {
		super(inst, gb, te);
	}

@Override
public ArrayList<String>listaInstrucciones(){
	return new ArrayList<>();
}

@Override
public int cantTarjetas() {
	return 0;
}

@Override
public Tarjeta getCopia(Filtro f) {
	return null;
}

}
