package Empleado_Dinamico;

public class SumaPagos extends FormaPago {

	FormaPago fp1;
	FormaPago fp2;
	
	
	
	public SumaPagos(FormaPago fp1, FormaPago fp2) {
		super();
		this.fp1 = fp1;
		this.fp2 = fp2;
	}



	public FormaPago getFp1() {
		return fp1;
	}



	public void setFp1(FormaPago fp1) {
		this.fp1 = fp1;
	}



	public FormaPago getFp2() {
		return fp2;
	}



	public void setFp2(FormaPago fp2) {
		this.fp2 = fp2;
	}



	public double calcularSueldo() {
		
		return fp1.calcularSueldo()+fp2.calcularSueldo();
	}
}
