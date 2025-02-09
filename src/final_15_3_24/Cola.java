package final_15_3_24;

import java.util.ArrayList;

public class Cola extends Estructura {

	private ArrayList<Estructura> colas;

	public Cola() {
		this.colas = new ArrayList<>();
	}

	public void addCola(Estructura e) {
		this.colas.add(e);
	}

	@Override
	public void addObjeto(Object o) {
		for (Estructura e : this.colas) {
			e.addObjeto(o);
		}
	}
	
	@Override
	public void removeObjeto(Object o) {
		for (Estructura e : this.colas) {
			e.removeObjeto(o);
		}
	}

}
