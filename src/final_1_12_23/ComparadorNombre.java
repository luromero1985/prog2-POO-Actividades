package final_1_12_23;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Tarea> {

	
	public int compare(Tarea t1, Tarea t2) {
		int respuesta= t1.getNombre().compareTo(t2.getNombre());
		
		if(respuesta==0) {
			//return  Integer.compare(t1.getCantEmpleados(), t2.getCantEmpleados());
			return t1.getCantEmpleados()-t2.getCantEmpleados();
		}
		
		return respuesta;
	}
	
}
