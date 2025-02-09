package Final_16_2_24;

import java.util.ArrayList;

public abstract class Coleccion {

	private Persona editor;
	private String titulo;


	public Coleccion(Persona e, String t) {
		this.editor = e;
		this.titulo = t;}

	public Persona getEditor() {
		return editor;
	}

	public void setEditor(Persona editor) {
		this.editor = editor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public boolean equals(Object o) {
		try {
			Coleccion otro = (Coleccion) o;
			return this.getEditor().equals(otro.getEditor()) && this.getTitulo().equals(otro.getTitulo());
		} catch (Exception e) {
			return false;
		}
	}

	public abstract int getCantPag();

	public ArrayList<Persona> editores() {
		ArrayList<Persona> rta = new ArrayList<>();
		rta.add(this.editor);
		return rta;
	}

	public abstract ArrayList<Persona> getAutores();

	public abstract Coleccion getCopia(Filtro f);
	
	
	public abstract int getPrecio();

}
