package ActividadPatronComposite;

import java.util.ArrayList;

public class ComponenteCompuesto extends ComponenteEmpresa {

	private ArrayList<ComponenteEmpresa> componentes = new ArrayList<>();


	public void agregarComponente(ComponenteEmpresa componente) {
		this.componentes.add(componente);
	}

	@Override
	public int contarEmpleadosConEspecialidad(String especialidad) {
		int contador=0; 
		for(ComponenteEmpresa comp: componentes) {
			contador+=comp.contarEmpleadosConEspecialidad(especialidad);
		}
		return contador;
	}



	@Override
	public String obtenerEspecialidadMayoritaria() {
		ArrayList<String> especialidades=new ArrayList<>();

		for (ComponenteEmpresa componente : componentes) {
			String especialidad = componente.obtenerEspecialidadMayoritaria();
			especialidades.add(especialidad);
		}

		int contadorMayor=0;
		String especialidadConcurrente=null;
		for (String especialidad : especialidades) {
			int contador=0;
			for (String esp : especialidades) {
				if(especialidad.equals(esp)) {
					contador++;
				}
			}  
			if (contadorMayor<contador) {
				contadorMayor=contador;
				especialidadConcurrente=especialidad;
			}
		}

		if(especialidadConcurrente!=null) {
			return especialidadConcurrente;
		}else{
			return "No hay especialidad";
		}

	}

	@Override
	public ArrayList<Empleado> obtenerEmpleadosConEspecialidad(String especialidad) {
		ArrayList<Empleado> empleados = new ArrayList<>();
		for (ComponenteEmpresa componente : componentes) {
			empleados.addAll(componente.obtenerEmpleadosConEspecialidad(especialidad));
		}
		return empleados;
	}
}
