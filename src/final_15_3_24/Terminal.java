package final_15_3_24;

import java.util.ArrayList;

public class Terminal extends Estructura {
	private ArrayList<Object> objetos;

	public Terminal() {
		this.objetos = new ArrayList<>();
	}

	// agrega el objeto al final de la lista (propio de java)
	@Override
	public void addObjeto(Object o) {
		this.objetos.add(o);
	}

	// recuperamos el primer elemento
	public Object getObject() {
		if (!this.objetos.isEmpty()) {
			return this.objetos.get(0);
		} else {
			return null;
		}
	}

	// cantitad total de elementos
	public int getCantidadElementos() {
		return this.objetos.size();
	}

	// terminal con más elementos
	public Terminal getColaConMasElementos() {
		return this;
	}

	// cantidad de colas terminales
	public int getCantidadColasTerminales() {
		return 1;
	}

	
	// control de objeto en la estructura
	public boolean estaObjeto(Object o) {
	
		if (this.objetos.contains(o)) {
			return true;
		} else {
			return false;
		}
	}

	// copia de la lista
	public Estructura getCopia() {
		ArrayList<Object> elemento = new ArrayList<>();
		for (Object a : this.objetos) {
			if (!elemento.contains(a) && a != null) {
				elemento.add(a);
			}
		}
		if (!elemento.isEmpty()) {
			Terminal copia = new Terminal();
			for (Object o : elemento) {
				copia.addObjeto(o);
			}
			return copia;
		}
		return null;

	}
}
