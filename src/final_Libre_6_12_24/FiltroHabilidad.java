package final_Libre_6_12_24;

public class FiltroHabilidad extends Filtro {

	
	private String hab;
	
	public FiltroHabilidad(String h) {
		this.hab=h;
	}
	
	
	@Override
	public boolean cumple(Personaje p) {
		return this.hab.equals(p.getHabilidad());
	}

}
