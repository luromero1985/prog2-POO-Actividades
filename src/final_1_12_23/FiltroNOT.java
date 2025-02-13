package final_1_12_23;

public class FiltroNOT extends Filtro {

	private Filtro filtro;
	
	public FiltroNOT(Filtro f) {
		this.filtro=f;
	}
	
	
	@Override
	public boolean cumple(Tarea t) {
	return !this.filtro.cumple(t);
	}

}
