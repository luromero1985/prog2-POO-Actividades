package Empleado_Dinamico;

public class SueldoFijo extends FormaPago {

	double sueldo;
	
	
	
	public SueldoFijo(double sueldo) {
		this.sueldo = sueldo;
	}



	public double calcularSueldo() {
		return sueldo;
	}
}
