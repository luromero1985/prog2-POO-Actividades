package final_1_03_24;

public abstract class Comida {
	private String nombre;
	private String tipo;
	private String modoPreparacion;

	
	
	public Comida(String nombre, String tipo, String modoPreparacion) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.modoPreparacion = modoPreparacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModoPreparacion() {
		return modoPreparacion;
	}
	public void setModoPreparacion(String modoPreparacion) {
		this.modoPreparacion = modoPreparacion;
	}
	
	
	public abstract int getCalorias();
	public abstract int getTiempoPreparac();
	public abstract double getPrecio();
	
	
	
	//al controlar si la lista contiene una comida, debo generar elquals
	public boolean equals(Object o) {
		try {
			Comida otro= (Comida)o;
			return this.getNombre().equals(otro.getNombre());
		}catch(Exception e) {
			return false;
		}
	}
}