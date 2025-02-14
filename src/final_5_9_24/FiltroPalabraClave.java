package final_5_9_24;

public class FiltroPalabraClave extends Filtro {

private String palabraClave;
	
	public FiltroPalabraClave(String p) {
		this.palabraClave=p;
	}
	@Override
	public boolean filtrar(Marcador m) {
		return m.tienePalabraClave(palabraClave);
	}
}
