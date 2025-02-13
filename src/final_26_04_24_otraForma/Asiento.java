package final_26_04_24_otraForma;

import java.util.ArrayList;

public class Asiento extends Tren {
	private int id;
	private ArrayList<String> facilidades;
	private Persona pasajero;
	private Condicion c;

	
	public Asiento (int id, Condicion c) {
		this.id=id;
		this.pasajero=null;
		this.facilidades = new ArrayList<>();
		this.c=c;
	}
	
	
	public void addFacilidades(String f) {
		if(!this.facilidades.contains(f)) {
			this.facilidades.add(f);
		}
	}
	
	public void setPasajero(Persona p) {
		this.pasajero=p;
	}
	
	public Persona getPasajero() {
		return this.pasajero;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	

	
	public Condicion getC() {
		return c;
	}


	public void setC(Condicion c) {
		this.c = c;
	}


	public boolean equals(Object o) {
		try {
			Asiento otro = (Asiento) o;
			return this.getId()==otro.getId();
		}
		catch(Exception e){
			return false;
		}
	}
	
	public boolean ocupable(Persona p ) {
		return  c.cumple(p);
	}
	
	
	public ArrayList<Asiento> lugaresDisponibles(Persona p){
		ArrayList<Asiento> aux = new ArrayList<>();
		if( this.ocupable(p) && this.pasajero==null) {
			
			aux.add(this);
		}
		return aux;
	}
	
	public int cantAsientos() {
		return 1;
	}
	
	public Tren copiaMia(Condicion c) {
		if(this.getPasajero() != null) {
			if(c.cumple(this.pasajero)) {
				Asiento aux = new Asiento (this.getId(),this.getC());
				aux.setPasajero(this.getPasajero());
				for(String s : this.facilidades) {
					aux.addFacilidades(s);
				}
				
				return aux;
			}
		}
		return null;
	}
}
