package ActividadPatronStrategy.strategy;

public class FiltroOR implements FiltroComida{

	private FiltroComida filtro1, filtro2;
	
	public FiltroOR(FiltroComida f1, FiltroComida f2) {
		this.filtro1=f1;
		this.filtro2=f2;
	}
	
	
	public boolean aplicar(Comida c) {
		return this.filtro1.aplicar(c) || filtro2.aplicar(c);
	}
}
