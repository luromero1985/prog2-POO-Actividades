package final_1_12_23;

public class Avanzada extends Compleja {
	public Avanzada(String nombre) {
		super(nombre);
	}

	@Override
	public int getTiempo() {
		int tiempoMaximo = 0;

		for (Tarea t : this.tareas) {
			int aux = t.getTiempo();
			if (aux > tiempoMaximo) {
				tiempoMaximo = aux;
			}
		}
		return tiempoMaximo;
	}

	@Override
	public int getCantEmpleados() {
		int cantidad = 0;

		for (Tarea t : this.tareas) {
			cantidad += t.getCantEmpleados();
		}
		return cantidad;
	}
}
