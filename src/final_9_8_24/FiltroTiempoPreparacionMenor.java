package final_9_8_24;

public class FiltroTiempoPreparacionMenor extends Filtro {

	private int tiempo;

	public FiltroTiempoPreparacionMenor(int t) {
		this.tiempo=t;
	}
	@Override
	public boolean cumple(Menu menu) {
		return menu.getTiempoPreparacion()<this.tiempo;
	}

}
