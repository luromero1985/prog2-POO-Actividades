package final_26_04_24_otraForma;

import java.util.ArrayList;

public class Vagon extends Tren {
	private String nombre;
	private ArrayList<Tren> trenes;


	public Vagon(String nombre) {
		this.nombre=nombre;
		this.trenes= new ArrayList<Tren>();
	}

	public void setNombre(String n) {
		this.nombre=n;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void addTren(Tren t) {
		if(!this.trenes.contains(t)) {
			trenes.add(t);
		}
	}

	public boolean equals(Object o) {
		try {
			Vagon otro = (Vagon)o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch (Exception e) {
			return false;
		}
	}

	public ArrayList<Asiento> lugaresDisponibles(Persona p){
		ArrayList<Asiento> aux = new ArrayList<>();
		 for(Tren t : this.trenes) {
			 ArrayList<Asiento> nuevos = t.lugaresDisponibles(p);
			 if(!nuevos.isEmpty()) {
				 for(Asiento a: nuevos) {
					 aux.add(a);
				 }
			 }
		 }
		return aux;
		
	}

	public int cantAsientos() {
		int i=0;
		for(Tren t: this.trenes) {
			i = i + t.cantAsientos();
		}
		return i;
	}

	public Tren copiaMia(Condicion c) {
		ArrayList<Tren> elementos = new ArrayList<>();
		for(Tren t:this.trenes) {
			Tren hijo = t.copiaMia(c);
			if(hijo!=null) {
				elementos.add(hijo);
			}
		}
		if(!elementos.isEmpty()) {
			Vagon copiaMia = new Vagon(this.getNombre());
			for(Tren t:elementos) {
				copiaMia.addTren(t);
			}
			return copiaMia;
		}
		else {
			return null;
		}
	}
}
