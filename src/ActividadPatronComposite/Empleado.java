package ActividadPatronComposite;

import java.util.ArrayList;

public class Empleado extends ComponenteEmpresa{
private int dni;
private String especialidad;
private double sueldo; 

public Empleado(int dni, String e, double s) {
	this.dni=dni;
	this.especialidad=e;
	this.sueldo=s;
	}

public int getDNI() {
	return this.dni;
}

public void setDNI(int dni) {
	this.dni=dni;
}

@Override
public String obtenerEspecialidadMayoritaria() {
    return this.especialidad;
}

public void setEspecialidad(String e) {
	this.especialidad=e;
}


public double getSueldo() {
	return this.sueldo;
}

public void setSueldo(double s) {
	this.sueldo=s;
}


@Override
public int contarEmpleadosConEspecialidad(String especialidad) {
    if( this.especialidad.equals(especialidad)) {
    	return 1;
    }else return 0;
}



@Override
public ArrayList<Empleado> obtenerEmpleadosConEspecialidad(String especialidad) {
    ArrayList<Empleado> resultado = new ArrayList<>();
    if (this.especialidad.equals(especialidad)) {
        resultado.add(this);
    }
    return resultado;
}


public String toString() {
	return "Empleado: "+this.getDNI()+". Especialidad: "+this.obtenerEspecialidadMayoritaria()+". Sueldo: "+this.getSueldo();
}
}
