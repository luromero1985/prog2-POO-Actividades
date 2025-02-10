package final_26_04_24_otraForma;

public class CondicionAND extends Condicion {
	private Condicion c1;
	private Condicion c2;


	public CondicionAND(Condicion c1, Condicion c2) {
		this.c1=c1;
		this.c2=c2;
	}
	
@Override
	public boolean cumple(Persona p) {
		return this.c1.cumple(p) && this.c2.cumple(p);
	}
	
}


