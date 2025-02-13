package final_15_3_24;

public abstract class Estructura {

	//consigna a)
	public abstract int getCantidadElementos();
	
	//consigna b)
	public abstract Terminal getColaConMasElementos(); 
	
	//consigna c)
	public abstract int getCantidadColasTerminales();
	
	//consigna d)
	public abstract boolean estaObjeto(Object o);
	
	//consigna d)
	public abstract Estructura getCopia();
	
	
	public abstract void addObjeto(Object o) ;
	public abstract Object getObject();
	public abstract void eliminarObjeto(Object o);
	

	
	
	
	}
