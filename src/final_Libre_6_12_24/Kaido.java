package final_Libre_6_12_24;

public class Kaido extends Personaje {

	public Kaido(String nombre, double altura, String habilidad) {
		super(nombre, altura, habilidad);
	}

	
	
	@Override
	public boolean meGustaMental(String m) {
		return true;
	}
}
