package final_20_12_24;

import java.time.LocalDate;

public class FiltroFecha extends Filtro {

	private LocalDate fecha;
	
	public FiltroFecha(LocalDate f) {
		this.fecha=f;
	}
	@Override
	public boolean cumple(Elemento d) {
		return this.fecha.equals(d.getFechaCreac());
	}

}
