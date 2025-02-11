package Final_16_2_24;

import java.util.ArrayList;

public class Capitulo extends Coleccion{

	private int cantPag;
	private String tema;
	private ArrayList<Persona> autores;
	private Calculador calculador;
	
	public Capitulo(Persona e, String t, Calculador c, int cantPag, String tema) {
		super(e, t);
		this.cantPag = cantPag;
		this.tema = tema;
		this.autores=new ArrayList<>();
		this.calculador=c;
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
	
	public Calculador getCalculador() {
		return calculador;
	}

	public void setCalculador(Calculador calculador) {
		this.calculador = calculador;
	}

	public ArrayList<Persona> getAutores(){
		return new ArrayList<Persona>(this.autores);
	}
	
	public void addAutor(Persona a) {
		if(!this.autores.contains(a)) {
			this.autores.add(a);
		}
	}
	public boolean esAutor(Persona p) {
		return this.autores.contains(p);
	}
	@Override
	public Coleccion getCopia(Filtro f) {
		if(f.cumple(this)) {
			Capitulo copia= new Capitulo(this.getEditor(), this.getTitulo(), this.getCalculador(), this.getCantPag(), this.getTema());
			for(Persona p:this.autores) {
				copia.addAutor(p);
			}
			return copia;
		}
			return null;
	}
	
	@Override
	public int getPrecio() {
	    return this.getCalculador().getPrecio();
	}
}
