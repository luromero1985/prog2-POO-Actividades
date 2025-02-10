package final_26_04_24;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		 SistemaTrenes sistema = new SistemaTrenes();
		 
		Tren miTren = new Seccion("Tren Rápido");
		Pasajero pasajero = new Pasajero("Juan", 25);
		Filtro filtro = new FiltroPorEdadMenorA(30);


        Vagon vagon1 = new Vagon("Vagon A");
        vagon1.addAsiento(new Asiento(1));
        vagon1.addAsiento(new Asiento(2));

        Vagon vagon2 = new Vagon("Vagon B");
        vagon2.addAsiento(new Asiento(3));
        vagon2.addAsiento(new Asiento(4));
        vagon2.addAsiento(new Asiento(5));

        Seccion seccion1 = new Seccion("Seccion 1");
        seccion1.addTren(vagon1);
        seccion1.addTren(vagon2);

        sistema.agregarTren(seccion1);

        System.out.println("Total de asientos en el sistema: " + sistema.totalAsientos());
    
		
		ArrayList<Asiento> asientosDisponibles = sistema.getAsientosDisponibles(pasajero, filtro);

		System.out.println("Asientos disponibles:");
		for (Asiento asiento : asientosDisponibles) {
		    System.out.println(asiento);
		}
		    
		    
		boolean asignado = sistema.asignarAsiento(pasajero, filtro);
		System.out.println("Asignación exitosa: " + asignado);


	}
}
