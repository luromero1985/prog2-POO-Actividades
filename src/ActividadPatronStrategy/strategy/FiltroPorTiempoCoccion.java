package strategy;

public class FiltroPorTiempoCoccion implements FiltroComida{
	   private int maxTiempo;
	    public FiltroPorTiempoCoccion(int maxTiempo) { 
	    	this.maxTiempo = maxTiempo; 
	    	}
	    
	    public boolean aplicar(Comida comida) { 
	    	return comida.getTiempoCoccion() < maxTiempo; 
	    	}

}
