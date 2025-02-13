package final_1_12_23;

import java.util.ArrayList;
import java.util.Collections;

public class Especializada extends Compleja {

	private Filtro f;
	
	public Especializada(String n, Filtro f) {
		super(n);
		this.f=f;
	}

	
	
	public Filtro getF() {
		return f;
	}



	public void setF(Filtro f) {
		this.f = f;
	}



	@Override
	public void addTarea(Tarea t) {
		if(f.cumple(t)) {
			super.addTarea(t);
		}
	}
	
	@Override
	public ArrayList<Tarea> buscar(Filtro f) {
		ArrayList<Tarea> respuesta = new ArrayList<>();
	
		for (Tarea t : this.tareas) {

			ArrayList<Tarea> rtaHijos = t.buscar(f);

			if (!rtaHijos.isEmpty()) {
				respuesta.addAll(rtaHijos);
			}
		}
		//con collection ya ordena con la forma que lo indico compareTo en tarea
		Collections.sort(respuesta);
		return respuesta;
	}
}
