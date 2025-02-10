package final_20_12_24;

public class FiltroNombre extends Filtro {

	private String nombre;
	
	public FiltroNombre(String nombre) {
		this.nombre=nombre;
	}
	@Override
	public boolean cumple(Elemento d) {
		return this.nombre.equals(d.getNombre());
	}

}
