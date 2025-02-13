package final_1_12_23;

import java.util.ArrayList;
import java.util.Comparator;

public class Basico extends Tarea {

	private int cantEmpleados;
	private int tiempo;

	public Basico(String n, int cantEmpleados, int tiempo) {
		super(n);
		this.cantEmpleados = cantEmpleados;
		this.tiempo = tiempo;
	}

	public int getCantEmpleados() {
		return cantEmpleados;
	}

	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public ArrayList<Tarea> buscar(Filtro f) {
		ArrayList<Tarea> respuesta = new ArrayList<>();

		if (f.cumple(this)) {
			respuesta.add(this);
		}
		return respuesta;
	}

	public ArrayList<Tarea> buscar(Filtro f, Comparator<Tarea> c) {
		ArrayList<Tarea> respuesta = new ArrayList<>();

		if (f.cumple(this)) {
			respuesta.add(this);
		}
		return respuesta;
	}

	@Override
	public Tarea getCopia() {
		Basico copia = new Basico(this.getNombre(), this.getCantEmpleados(), this.getTiempo());
		return copia;
	}

}
