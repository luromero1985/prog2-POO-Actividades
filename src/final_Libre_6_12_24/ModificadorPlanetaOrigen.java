package final_Libre_6_12_24;

public class ModificadorPlanetaOrigen implements Modificador {

	private String planeta;
	
	public ModificadorPlanetaOrigen(String p) {
		this.planeta=p;
	}
	

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	public Individual transformar(Individual t) {
		t.setPlaneta(planeta);
		return t;
	}
}
