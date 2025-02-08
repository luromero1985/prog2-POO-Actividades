package final_1_03_24;

public class AdicionalCompuesto extends Adicional {

	private Adicional ad1;
	private Adicional ad2;
	
	
	
	public AdicionalCompuesto(Adicional ad1, Adicional ad2) {
		this.ad1 = ad1;
		this.ad2 = ad2;
	}



	@Override
	public double extra(Comida c) {
				return this.ad1.extra(c) + this.ad2.extra(c);
	}

}
