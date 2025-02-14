package final_Libre_6_12_24;

public class ModificadorTalle implements Modificador {

	private static int aumento = 1;
	
	

	public static int getAumento() {
		return aumento;
	}



	public static void setAumento(int aumento) {
		ModificadorTalle.aumento = aumento;
	}



	public Individual transformar(Individual t) {

		t.setTalle(t.getTalle() + aumento);
		
		return t;
	}
}
