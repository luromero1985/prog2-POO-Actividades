package Final_16_2_24;

import java.util.ArrayList;

public class Capitulo extends Coleccion{

	private int cantPag;
	private String tema;
	private ArrayList<Persona> autores;
	
	public Capitulo(Persona e, String t, int cantPag, String tema) {
		super(e, t);
		this.cantPag = cantPag;
		this.tema = tema;
		this.autores=new ArrayList<>();
	}

	@Override
	public int getCantPag() {
		return cantPag;
	}

	
	public void setCantPag(int cantPag) {
		this.cantPag = cantPag;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public ArrayList<Persona> getAutores(){
		return new ArrayList<Persona>(this.autores);
	}
	
	public void addAutor(Persona a) {
		if(!this.autores.contains(a)) {
			this.autores.add(a);
		}
	}
}
