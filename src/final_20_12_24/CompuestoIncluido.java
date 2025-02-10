package final_20_12_24;

import java.time.LocalDate;
import java.util.ArrayList;

public class CompuestoIncluido extends Compuesto {

	public CompuestoIncluido(String n, LocalDate fc) {
		super(n, fc);

	}

	@Override

	public ArrayList<Elemento> getBuscar(Filtro f) {
		ArrayList<Elemento> resultado = super.getBuscar(f);

		if (f.cumple(this)) {
			resultado.add(this);
		}

		return resultado;
	}
}
