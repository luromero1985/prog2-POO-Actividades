package final_26_04_24;

public class FiltroNOT extends Filtro {

	private Filtro filtro;
	
	public FiltroNOT(Filtro f) {
		this.filtro=f;
	}
	@Override
	public boolean cumple(Pasajero t) {
		return !this.filtro.cumple(t);
	}

}
