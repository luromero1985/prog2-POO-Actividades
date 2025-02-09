package Empleado_Dinamico;

public class Empleado {
	String nombre;
	FormaPago fp;
	
	public Empleado(String nombre, FormaPago fp) {
		this.nombre = nombre;
		this.fp = fp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSueldo() {
		return fp.calcularSueldo();
	}

	public void setFp(FormaPago fp) {
		this.fp = fp;
	}
	
	
}
