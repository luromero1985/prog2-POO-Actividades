package tp6.actividad2;

import java.util.ArrayList;
import java.util.Collections;

public class MainCentroComputos {
	/*	Centro de Cómputos
	Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las
	computadoras que dispone. 
	Si no hay computadoras disponibles los procesos a ejecutar deben
	esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de
	memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer
	lugar). 
	Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
	prioriza la selección de las computadoras más rápidas.
*/
	
	public static void main(String[] args) {
	
		Computadora c1 = new Computadora("comp1", 5, 16);
        Computadora c2 = new Computadora("comp2", 3, 16);
        Computadora c3 = new Computadora("comp3", 9, 32);
        Computadora c4 = new Computadora("comp4", 1, 8);
        Computadora c5 = new Computadora("comp5", 5,32);
        Computadora c6 = new Computadora("comp6", 2,8);

       // ListaOrdenada computadoras = new ListaOrdenada();
      /*  computadoras.agregarElemento(c5);
        computadoras.agregarElemento(c1);
        computadoras.agregarElemento(c2);
        computadoras.agregarElemento(c3);
        computadoras.agregarElemento(c4);
        computadoras.agregarElemento(c6);
*/
        
        ArrayList<Computadora> computadoras=new ArrayList<>();
        computadoras.add(c6);
        computadoras.add(c1);
        computadoras.add(c2);
        System.out.println("Computadoras ordenadas por velocidad");
        System.out.println(computadoras);
 
        System.out.println("hola".compareTo("hau"));
      Collections.sort(computadoras, new ComparadorNombre());

	}

}
