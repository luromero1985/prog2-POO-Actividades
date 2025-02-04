package strategy;

public class RestauranteMain {

	public static void main(String[] args) {

		
		Comida c1= new Comida("Ensalada César", "ensalada", 10, "fresco");
		Comida c2= new Comida("Helado", "postre", 5, "congelado");
	    Comida c3= new Comida("Milanesa", "plato principal", 20, "frito");
	    Comida c4= new Comida("Papas fritas", "guarnición", 8, "frito");
	    Comida c5= new Comida("Tarta de manzana", "postre", 25, "horneado");
		Comida c6= new Comida("Ensalada Lechuga y tomate", "ensalada", 7, "fresco");   
		Comida c7= new Comida("Ensalada Frita", "ensalada", 12, "frito");
	    
		FiltroComida filtroPorTiempo= new FiltroPorTiempoCoccion(15);
		FiltroComida filtroEnsalada= new FiltroPorTipo("ensalada");
		FiltroComida filtroPostre= new FiltroPorTipo("postre");
		FiltroComida filtroFrito= new FiltroPorModoPreparacion("frito");
		FiltroComida filtroNOTTiempo= new FiltroNOT(filtroPorTiempo);
		FiltroComida filtroEnsaladaFrito= new FiltroAND(filtroEnsalada,filtroFrito);
		
		
	    Estacion estacionEnsaladas = new Estacion("Estación de Ensaladas", filtroEnsalada);
        Estacion estacionFritos = new Estacion("Estación de Fritos", filtroFrito);
        Estacion estacionPostres = new Estacion("Estación de Postres", filtroPostre);
        Estacion estacionRapida = new Estacion("Estación Rápida", filtroPorTiempo);
 //filtros combinados
        Estacion estacionLenta =new Estacion("Estacion lenta", filtroNOTTiempo);
        Estacion estacionEnsaladaFrito = new Estacion("Estación fritoEnsalada",filtroEnsaladaFrito);   
        
        
        estacionEnsaladas.asignarComida(c1);
        estacionEnsaladas.asignarComida(c6);
        estacionFritos.asignarComida(c3);
        estacionFritos.asignarComida(c4);
        estacionPostres.asignarComida(c2);
        estacionPostres.asignarComida(c5);
        estacionRapida.asignarComida(c1);
        estacionRapida.asignarComida(c2);
        estacionRapida.asignarComida(c4);
        estacionRapida.asignarComida(c6);
        estacionLenta.asignarComida(c5);
        estacionEnsaladaFrito.asignarComida(c7);
	}

}
