package final_1_12_23;

public class FiltroMenosEmpleadosQue extends Filtro {

	
	private int cantEmpleados;
	
	public FiltroMenosEmpleadosQue(int cant) {
		this.cantEmpleados=cant;
	}
	
	@Override
	public boolean cumple(Tarea t) {
		return this.cantEmpleados>t.getCantEmpleados();
	}

}
