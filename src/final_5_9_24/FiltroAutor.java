package final_5_9_24;

public class FiltroAutor extends Filtro {

	
	private String autor;
	
	public FiltroAutor(String autor) {
		this.autor=autor;
	}
	@Override
	public boolean filtrar(Marcador m) {
		return this.autor.equals(m.getNombre());
	}

}
