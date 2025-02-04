package final_9_8_24;

public class FiltroAND extends Filtro {

	private Filtro filtro1, filtro2;
	
	public FiltroAND(Filtro f1, Filtro f2) {
		this.filtro1=f1;
		this.filtro2=f2;
	}
	
	
	
	@Override
	public boolean cumple(Menu menu) {
	  return this.filtro1.cumple(menu)&& this.filtro2.cumple(menu);
	}

}
