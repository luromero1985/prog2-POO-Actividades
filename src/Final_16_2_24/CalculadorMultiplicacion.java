package Final_16_2_24;

public class CalculadorMultiplicacion implements Calculador{

	private int valor1, valor2;
	
	public CalculadorMultiplicacion(int v1, int v2) {
		this.valor1=v1; 
		this.valor2=v2;
	}
	

	
	public int getValor1() {
		return valor1;
	}



	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}



	public int getValor2() {
		return valor2;
	}



	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}



	@Override
public int getPrecio() {
		return this.valor1*this.valor2;
	}

}
