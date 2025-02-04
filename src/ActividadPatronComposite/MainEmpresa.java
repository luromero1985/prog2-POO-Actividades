package ActividadPatronComposite;

public class MainEmpresa {

	public static void main(String[] args) {


		ComponenteCompuesto comp =new ComponenteCompuesto();


		Empleado empleado1 = new Empleado(1001, "Programador", 80000);
		Empleado empleado2 = new Empleado(1002, "Analista", 90000);
		Empleado empleado3 = new Empleado(1003, "Tester", 70000);
		Empleado empleado4 = new Empleado(1004, "Programador", 75000);
		Empleado empleado5 = new Empleado(1005, "Programador", 85000);
		Empleado empleado6 = new Empleado(1006, "Soporte", 60000);
		Empleado empleado7 = new Empleado(1007, "Tester", 72000);
		Empleado empleado8 = new Empleado(1008, "Analista", 95000);
		Empleado empleado9 = new Empleado(1009, "Diseñador", 77000);
		Empleado empleado10 = new Empleado(1010, "Soporte", 61000);


		
		comp.agregarComponente(empleado1);
		comp.agregarComponente(empleado2);
		comp.agregarComponente(empleado3);
		comp.agregarComponente(empleado4);
		comp.agregarComponente(empleado5);
		comp.agregarComponente(empleado6);
		comp.agregarComponente(empleado7);
		comp.agregarComponente(empleado8);
		comp.agregarComponente(empleado9);
		comp.agregarComponente(empleado10);
		
		
	
		int contador= comp.contarEmpleadosConEspecialidad("Programador");
		System.out.println("Cantidad de empleados con especialidad Programador: "+ contador);
		
		
		String especialidadMayoritaria=comp.obtenerEspecialidadMayoritaria();
		System.out.println(especialidadMayoritaria);
		
		
	
		for(Empleado empleado: comp.obtenerEmpleadosConEspecialidad("Programador")) {
			System.out.println(empleado+", ");	
			
		}
		
	}

}
