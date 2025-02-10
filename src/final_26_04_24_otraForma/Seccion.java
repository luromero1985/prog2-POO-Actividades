package final_26_04_24_otraForma;

import java.util.ArrayList;

public class Seccion extends Tren {
	private String nombre;
	private ArrayList<Tren> divisiones;


	public Seccion(String nombre) {
		this.nombre=nombre;
		this.divisiones= new ArrayList<Tren>();
	}

	public void setNombre(String n) {
		this.nombre=n;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void addDivision(Tren t) {
		if(!this.divisiones.contains(t)) {
			divisiones.add(t);
		}
	}

	public boolean equals(Object o) {
		try {
			Seccion otro = (Seccion)o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch (Exception e) {
			return false;
		}
	}

	public ArrayList<Asiento> lugaresDisponibles(Persona p){
		ArrayList<Asiento> aux = new ArrayList<>();
		 for(Tren t : this.divisiones) {
			 ArrayList<Asiento> nuevos = t.lugaresDisponibles(p);
			 if(!nuevos.isEmpty()) {
				 for(Asiento a: nuevos) {
					 aux.add(a);
				 }
			 }
		 }
		return aux;
		
	}

	public int informeDisponibilidad() {
		int i=0;
		for(Tren t: this.divisiones) {
			i = i + t.informeDisponibilidad();
		}
		return i;
	}

	public Tren copiaMia(Condicion c) {
		ArrayList<Tren> elementos = new ArrayList<>();
		for(Tren t:this.divisiones) {
			Tren hijo = t.copiaMia(c);
			if(hijo!=null) {
				elementos.add(hijo);
			}
		}
		if(!elementos.isEmpty()) {
			Seccion copiaMia = new Seccion(this.getNombre());
			for(Tren t:elementos) {
				copiaMia.addDivision(t);
			}
			return copiaMia;
		}
		else {
			return null;
		}
	}
}
