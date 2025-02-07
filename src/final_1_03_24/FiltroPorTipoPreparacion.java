package final_1_03_24;

public class FiltroPorTipoPreparacion extends Filtro {
	private String tipoP;

	public FiltroPorTipoPreparacion(String tp) {
		this.tipoP=tp;
	}

	public boolean cumple(Comida c) {
		return c.getTipo().equals(this.tipoP);
	}

}
