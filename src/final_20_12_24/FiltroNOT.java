package final_20_12_24;

public class FiltroNOT extends Filtro {

	private Filtro filtro;
	
	public FiltroNOT(Filtro f) {
		this.filtro=f;
	}
	@Override
	public boolean cumple(Elemento d) {
		return !this.filtro.cumple(d) ;
	}

}
