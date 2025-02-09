package Final_16_2_24;

public class CalculadorFijo implements Calculador {
	private int valor;

	public CalculadorFijo(int v) {
		this.valor = v;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public int getPrecio() {
		return this.valor;
	}
}
