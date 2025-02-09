package Final_16_2_24;

public class CalculadorAND implements Calculador {
	
	private Calculador calc1, calc2;
	
	public CalculadorAND(Calculador c1, Calculador c2) {
		this.calc1=c1;
		this.calc2=c2;
	}

	public Calculador getCalc1() {
		return calc1;
	}

	public void setCalc1(Calculador calc1) {
		this.calc1 = calc1;
	}

	public Calculador getCalc2() {
		return calc2;
	}

	public void setCalc2(Calculador calc2) {
		this.calc2 = calc2;
	}
	
	@Override
public int getPrecio() {
		return this.calc1.getPrecio()+this.calc2.getPrecio();
	}
	

}
