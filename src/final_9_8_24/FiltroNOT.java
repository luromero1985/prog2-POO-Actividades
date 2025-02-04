package final_9_8_24;

public class FiltroNOT extends Filtro {

private Filtro filtro;
	
	public FiltroNOT(Filtro f) {
		this.filtro=f;
	}
	
	
	
	@Override
	public boolean cumple(Menu menu) {
	  return !this.filtro.cumple(menu);
	}
}
