package final_20_12_24;

public class FiltroAND extends Filtro {

	private Filtro filtro1, filtro2;
	
	public FiltroAND(Filtro f1, Filtro f2) {
		this.filtro1=f1;
		this.filtro2=f2;
	}
	@Override
	public boolean cumple(Elemento d) {
		return this.filtro1.cumple(d) && this.filtro2.cumple(d);
	}

}
