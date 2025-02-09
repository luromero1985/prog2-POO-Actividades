package final_26_04_24;

public class FiltroAND extends Filtro {

	private Filtro filtro1, filtro2;
	
	public FiltroAND(Filtro f1, Filtro f2) {
		this.filtro1=f1;
		this.filtro2=f2;
	}
	@Override
	public boolean cumple(Pasajero t) {
		return this.filtro1.cumple(t)&& this.filtro2.cumple(t);
	}

}
