package ActividadPatronStrategy.strategy;

public class FiltroNOT implements FiltroComida{

	private FiltroComida filtro;
	
	public FiltroNOT(FiltroComida f) {
		this.filtro=f;
	}
	
	
	public boolean aplicar(Comida c) {
		return !this.filtro.aplicar(c);
	}

}
