package strategy;

import java.util.ArrayList;
import java.util.List;

public class Estacion {
	  private String nombre;
	    private FiltroComida filtro;  //aca es donde se hace uso de Strategy, declarando al filtro como interfaz
	    private List<Comida> comidasAsignadas;

	    public Estacion(String nombre, FiltroComida filtro) {
	        this.nombre = nombre;
	        this.filtro = filtro;
	        this.comidasAsignadas = new ArrayList<>();
	    }
	    
	    
public String getNombre() {
	return this.nombre;
}


	    public void asignarComida(Comida comida) {
	        if (filtro.aplicar(comida)) {
	            comidasAsignadas.add(comida);
	            System.out.println("\"" + comida.getNombre() + "\" asignado a " + this.getNombre());
	        }
	    }
}
