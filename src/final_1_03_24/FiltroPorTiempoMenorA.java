package final_1_03_24;

public class FiltroPorTiempoMenorA  extends Filtro {
	private int tiempo;

	public FiltroPorTiempoMenorA(int t) {
		this.tiempo=t;
	}

	public boolean cumple(Comida c) {
		return c.getTiempoPreparac()<this.tiempo;
	}

}
