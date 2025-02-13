package final_1_12_23;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Compleja extends Tarea {

	protected ArrayList<Tarea> tareas;

	public Compleja(String n) {
		super(n);
		this.tareas = new ArrayList<>();
	}

	public void addTarea(Tarea t) {
		if (!this.tareas.contains(t)) {
			this.tareas.add(t);
		}
	}

	public int getCantEmpleados() {
		int cantidad = 0;

		for (Tarea t : this.tareas) {
			int aux = t.getCantEmpleados();
			if (aux > cantidad) {
				cantidad = aux;
			}
		}
		return cantidad;
	}

	public int getTiempo() {
		int tiempo = 0;

		for (Tarea t : this.tareas) {
			tiempo += t.getTiempo();
		}
		return tiempo;
	}

	@Override
	public ArrayList<Tarea> buscar(Filtro f, Comparator<Tarea> c) {
		ArrayList<Tarea> respuesta = new ArrayList<>();
		if (f.cumple(this)) {
			respuesta.add(this);
			return respuesta;
		} else {
			for (Tarea t : this.tareas) {

				ArrayList<Tarea> rtaHijos = t.buscar(f, c);

				if (!rtaHijos.isEmpty()) {
					respuesta.addAll(rtaHijos);
				}
			}
			Collections.sort(respuesta, c);
			return respuesta;
		}
	}
@Override
	public ArrayList<Tarea> buscar(Filtro f) {
		ArrayList<Tarea> respuesta = new ArrayList<>();
		if (f.cumple(this)) {
			respuesta.add(this);
			return respuesta;
		}
		for (Tarea t : this.tareas) {

			ArrayList<Tarea> rtaHijos = t.buscar(f);

			if (!rtaHijos.isEmpty()) {
				respuesta.addAll(rtaHijos);
			}
		}
		// con collection ya ordena con la forma que lo indico compareTo en tarea
		Collections.sort(respuesta);
		return respuesta;
	}

	@Override
	public Tarea getCopia() {

		Compleja copia = new Compleja(this.getNombre());
		for (Tarea t : this.tareas) {
			Tarea hijo = t.getCopia();
			copia.addTarea(hijo);
		}
		return copia;

	}


}
