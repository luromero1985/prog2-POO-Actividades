package final_26_04_24;

public class FiltroPorEdadMenorA extends Filtro {

	private int edad;
	
	public FiltroPorEdadMenorA(int edad) {
		this.edad=edad;
	}
	
	
	@Override
	public boolean cumple(Pasajero p) {
	
		return this.edad>p.getEdad();
	}

}
