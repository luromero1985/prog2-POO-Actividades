package final_Libre_6_12_24;

public class Especial extends EquipoTactico {

	public Especial(String nombre) {
		super(nombre);
	}

	
	@Override
	
	public int getTalle() {
		return this.trajes.get(0).getTalle();
	}
}
