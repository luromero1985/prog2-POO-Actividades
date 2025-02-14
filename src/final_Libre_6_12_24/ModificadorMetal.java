package final_Libre_6_12_24;

public class ModificadorMetal implements Modificador {

	private String metal;

	public ModificadorMetal(String m) {
		this.metal=m;
	}
	
	public String getMetal() {
		return metal;
	}


	public void setMetal(String metal) {
		this.metal = metal;
	}


	public Individual transformar(Individual t) {
		t.addMetalUsado(metal);
		return t;
	}

}
