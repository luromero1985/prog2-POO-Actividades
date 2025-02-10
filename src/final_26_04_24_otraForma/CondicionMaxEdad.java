package final_26_04_24_otraForma;

public class CondicionMaxEdad extends Condicion {

	private int max;

	public CondicionMaxEdad(int m) {
		this.max=m;
	}
@Override
	public boolean cumple(Persona p) {
		return p.getEdad()< max;
	}

}
