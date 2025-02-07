package ActividadPatronStrategy;

class Comida {
    private String nombre;
    private String tipo;
    private int tiempoCoccion;
    private String modoPreparacion;

    public Comida(String nombre, String tipo, int tiempoCoccion, String modoPreparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tiempoCoccion = tiempoCoccion;
        this.modoPreparacion = modoPreparacion;
    }

    public String getTipo() { 
    	return tipo; 
    	}
    
    public int getTiempoCoccion() { 
    	return tiempoCoccion; 
    	}
    
    public String getModoPreparacion() { 
    	return modoPreparacion; 
    	}
    
    public String getNombre() { 
    	return nombre; 
    	}

    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getTipo() + ", " + this.getTiempoCoccion() + " min, " + this.getModoPreparacion() + ")";
    }
}
