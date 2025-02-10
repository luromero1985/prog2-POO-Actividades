package final_20_12_24;

import java.time.LocalDate;
import java.util.ArrayList;

public class Simple extends Elemento {
	private int tamanio;
	private String informacion;

	public Simple(String n, LocalDate fc, String info, int t) {
		super(n, fc);
		this.informacion = info;
		this.tamanio = t;
	}

	@Override
	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public String getInformacion() {
		return this.informacion;
	}

	public void setInformacion(String i) {
		this.informacion = i;
	}

	@Override
	public ArrayList<Elemento> getBuscar(Filtro f) {
		ArrayList<Elemento> resultado=new ArrayList<>();
		if (f.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
}
