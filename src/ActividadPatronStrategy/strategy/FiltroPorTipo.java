package strategy;

public class FiltroPorTipo implements FiltroComida{
	private String tipo;
    public FiltroPorTipo(String tipo) { 
    	this.tipo = tipo; 
    	}
    
    public boolean aplicar(Comida comida) { 
    	return comida.getTipo().equalsIgnoreCase(tipo); 
    	}
}
