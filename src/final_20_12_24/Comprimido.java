package final_20_12_24;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comprimido extends Compuesto{

	private int porcCompresion;

	public Comprimido(String nombre, LocalDate f, int pc) {
		super(nombre, f);
		this.porcCompresion = pc;
	}

	public int getPorcCompresion() {
		return porcCompresion;
	}

	public void setPorcCompresion(int porcCompresion) {
		this.porcCompresion = porcCompresion;
	}

	@Override
	public int getTamanio() {
		return super.getTamanio() * this.porcCompresion;

	}

	@Override
	public ArrayList<Elemento> getBuscar(Filtro f) {
		ArrayList<Elemento> resultado = new ArrayList<>();

		if (f.cumple(this)) {
			resultado.add(this);
		}else if(!super.getBuscar(f).isEmpty()){
			resultado.add(this);
		}
		return resultado;
	}
}
