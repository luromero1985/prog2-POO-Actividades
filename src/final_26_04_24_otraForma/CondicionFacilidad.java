package final_26_04_24_otraForma;

public class CondicionFacilidad extends Condicion {

	public String facilidad;
		
	public CondicionFacilidad(String f) {
		this.facilidad=f;
	}


	public boolean cumple(Persona p) {
		return p.getPreferencias().contains(p);
	}

}
