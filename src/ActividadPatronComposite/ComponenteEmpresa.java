package ActividadPatronComposite;

import java.util.ArrayList;

public abstract class ComponenteEmpresa {
	 public abstract int contarEmpleadosConEspecialidad(String especialidad);
	    public abstract String obtenerEspecialidadMayoritaria();
	    public abstract ArrayList<Empleado> obtenerEmpleadosConEspecialidad(String especialidad);
}
