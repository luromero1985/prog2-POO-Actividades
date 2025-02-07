package ActividadPatronStrategy.strategy;

public class FiltroPorModoPreparacion implements FiltroComida {

	    private String modo;
	    public FiltroPorModoPreparacion(String modo) {
	    	this.modo = modo; 
	    	}
	    
	    public boolean aplicar(Comida comida) {
	    	return comida.getModoPreparacion().equalsIgnoreCase(modo); 
	    	}
	}

