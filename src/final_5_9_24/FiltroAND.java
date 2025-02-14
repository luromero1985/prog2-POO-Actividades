package final_5_9_24;

public class FiltroAND extends Filtro {

	private Filtro filtro1, filtro2;

	public FiltroAND(Filtro f1, Filtro f2) {
		this.filtro1 = f1;
		this.filtro2 = f2;
	}

	@Override
	public boolean filtrar(Marcador m) {
		return this.filtro1.filtrar(m) && this.filtro2.filtrar(m);
	}

}
