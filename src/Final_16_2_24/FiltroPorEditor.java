package Final_16_2_24;

public class FiltroPorEditor extends Filtro {

	private Persona editor;
	
	public FiltroPorEditor(Persona p) {
		this.editor=p;
	}
	@Override
	public boolean cumple(Coleccion c) {
		return c.editores().contains(this.editor);
	}

}
