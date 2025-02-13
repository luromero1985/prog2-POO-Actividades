package final_1_12_23;

public class FiltroPorTiempoMenorA extends Filtro {

	
	private int tiempo;
	
	public FiltroPorTiempoMenorA(int tiempo) {
		this.tiempo=tiempo;
	}
	@Override
	public boolean cumple(Tarea t) {
		return this.tiempo>t.getTiempo();
	}

}
