package final_26_04_24;

public class FiltroPorPreferencia extends Filtro {

	private String preferencia;
	
	public FiltroPorPreferencia(String p) {
		this.preferencia=p;
	}
	@Override
	public boolean cumple(Pasajero t) {
		return t.getPreferencia().contains(this.preferencia);
	}

}
