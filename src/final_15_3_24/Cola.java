package final_15_3_24;

import java.util.ArrayList;

public class Cola extends Estructura {

	private ArrayList<Estructura> estructuras;
	private Seleccion recuperar;
	private Seleccion agregar;

	public Cola(Seleccion a, Seleccion r) {
		this.estructuras = new ArrayList<>();
		this.agregar = a;
		this.recuperar = r;
	}

	public Seleccion getRecuperar() {
		return recuperar;
	}

	public void setRecuperar(Seleccion recuperar) {
		this.recuperar = recuperar;
	}

	public Seleccion getAgregar() {
		return agregar;
	}

	public void setAgregar(Seleccion agregar) {
		this.agregar = agregar;
	}

	public void addEstructura(Estructura e) {
		if (!this.estructuras.contains(e)) {
			this.estructuras.add(e);
		}
	}
	
	@Override
	public Object getObject() {
		int pos = this.recuperar.subCola(this.estructuras);
		Object rta=null;
		if (pos >= 0 && pos < this.estructuras.size()) {
			rta= this.estructuras.get(pos).getObject();
		}
		return rta;
	}

	@Override
	public void addObjeto(Object o) {
		int pos = this.agregar.subCola(this.estructuras);
		if (pos >= 0 && pos < this.estructuras.size()) {
			this.estructuras.get(pos).addObjeto(o);
		}
	}

	@Override
	public void eliminarObjeto(Object o) {
		int pos = this.recuperar.subCola(this.estructuras);
		if (pos >= 0 && pos < this.estructuras.size()) {
			
			this.estructuras.get(pos).eliminarObjeto(o);
		}
	}
	@Override
	public int getCantidadElementos() {
		int cantidad = 0;

		for (Estructura e : this.estructuras) {
			cantidad += e.getCantidadElementos();
		}
		return cantidad;
	}

	public Terminal getColaConMasElementos() {
		int cantidad = 0;
		Terminal mayorEstructura = null;
		for (Estructura e : this.estructuras) {
			Terminal hijo = e.getColaConMasElementos();
			if (hijo.getCantidadElementos() > cantidad) {
				cantidad = hijo.getCantidadElementos();
				mayorEstructura = hijo;
			}
		}
		return mayorEstructura;
	}

	@Override
	public int getCantidadColasTerminales() {
		int cantidad = 0;

		for (Estructura e : this.estructuras) {
			cantidad += e.getCantidadColasTerminales();
		}
		return cantidad;
	}

	@Override
	public boolean estaObjeto(Object o) {
		for (Estructura e : this.estructuras) {
			if (e.estaObjeto(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Estructura getCopia() {
		ArrayList<Estructura> elementos = new ArrayList<>();

		for (Estructura e : this.estructuras) {
			Estructura hijo = e.getCopia();
			if (hijo != null && !elementos.contains(hijo)) {
				elementos.add(hijo);
			}
		}
		if (!elementos.isEmpty()) {
			Cola copia = new Cola(this.getAgregar(), this.getRecuperar());
			for (Estructura e : elementos) {
				copia.addEstructura(e);
			}
			return copia;
		}
		return null;
	}
}