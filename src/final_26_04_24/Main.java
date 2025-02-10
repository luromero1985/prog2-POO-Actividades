package final_26_04_24;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Tren miTren = new Seccion("Tren Rápido");
		Pasajero pasajero = new Pasajero("Juan", 25);
		Filtro filtro = new FiltroPorEdadMenorA(30);

		
		
		ArrayList<Asiento> asientosDisponibles = miTren.getAsientosDisponibles(pasajero, filtro);

		System.out.println("Asientos disponibles:");
		for (Asiento asiento : asientosDisponibles) {
		    System.out.println(asiento);
		}
		    
		    
		boolean asignado = miTren.asignarAsiento(pasajero, filtro);
		System.out.println("Asignación exitosa: " + asignado);


	}
}
