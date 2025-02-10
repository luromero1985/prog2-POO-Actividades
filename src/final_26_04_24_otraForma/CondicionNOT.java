package final_26_04_24_otraForma;

public class CondicionNOT extends Condicion {

	private Condicion c;

	public CondicionNOT(Condicion c) {
		this.c = c;
	}

	@Override
	public boolean cumple(Persona p) {
		return !c.cumple(p);
	}
}
