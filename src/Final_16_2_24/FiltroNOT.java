package Final_16_2_24;

public class FiltroNOT extends Filtro {

	private Filtro filtro;
	public FiltroNOT(Filtro f) {
		this.filtro=f;
	
	}
	
	
	@Override
	public boolean cumple(Coleccion c) {
	 return !this.filtro.cumple(c);
	 }

}
