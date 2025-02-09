package Final_16_2_24;

public class FiltroPorAutor extends Filtro {

	private Persona autor;
	
	public FiltroPorAutor(Persona p) {
		this.autor=p;
	}
	@Override
	public boolean cumple(Coleccion c) {
		return c.getAutores().contains(this.autor);
	}

}
