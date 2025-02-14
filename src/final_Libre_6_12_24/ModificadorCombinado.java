package final_Libre_6_12_24;

public class ModificadorCombinado implements Modificador {
	private Modificador m1, m2;

	public ModificadorCombinado(Modificador m1, Modificador m2) {
		this.m1 = m1;
		this.m2 = m2;
	}

	public Modificador getM1() {
		return m1;
	}

	public void setM1(Modificador m1) {
		this.m1 = m1;
	}

	public Modificador getM2() {
		return m2;
	}

	public void setM2(Modificador m2) {
		this.m2 = m2;
	}

	public Individual transformar(Individual t) {
		Individual cambio1 = this.getM1().transformar(t);
		return this.getM2().transformar(cambio1);
	}

}
