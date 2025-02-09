package Empleado_Dinamico;

public class ComisionVentas extends FormaPago {
	double ventas;
	double comision;

	public ComisionVentas(double ventas, double comision) {
		this.ventas = ventas;
		this.comision = comision;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public double calcularSueldo() {
		return ventas * comision;
	}

}
