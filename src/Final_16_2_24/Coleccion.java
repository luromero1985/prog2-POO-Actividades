package Final_16_2_24;

public abstract class Coleccion {

	private Persona editor;
	private String titulo;
	
	public Coleccion(Persona e, String t) {
		this.editor=e;
		this.titulo=t;
	}

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
			Coleccion otro= (Coleccion)o;
			return this.getEditor().equals(otro.getEditor())&& this.getTitulo().equals(otro.getTitulo());
		}
	}
	
	
	public abstract int getCantPag();
	
	public abstract Coleccion getCopia();
}
