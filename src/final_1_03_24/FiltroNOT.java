package final_1_03_24;

public class FiltroNOT extends Filtro {

	private Filtro filtro;
	
	public FiltroNOT(Filtro f) {
		this.filtro=f;
	}
	@Override
	public boolean cumple(Comida c) {
	
		return !this.filtro.cumple(c) ;
	}

}
