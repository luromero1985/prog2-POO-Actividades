package final_1_12_23;

public class Especial extends Basico {

	private int costo;

	public Especial(String n, int cantEmpleados, int tiempo, int costo) {
		super(n, cantEmpleados, tiempo);
		this.costo=costo;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
}
