package final_1_03_24;

public class AdicionalPesos extends Adicional {
	private Filtro f;
	private int extraSi;
	private int extraNo;

	
	public AdicionalPesos(Filtro f, int extraSi, int extraNo) {
		this.f = f;
		this.extraSi = extraSi;
		this.extraNo = extraNo;
	}


	public double extra(Comida c) {
		double aux=0;
		if (this.f.cumple(c)) {
			aux=this.extraSi;
		} else {
			aux=this.extraNo;
		}
		return aux;
	}
}
