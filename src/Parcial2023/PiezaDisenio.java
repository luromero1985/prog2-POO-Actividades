package Parcial2023;

public class PiezaDisenio extends PiezaCompuesta {

	
	private Filtro filtro;
	
	public PiezaDisenio(Filtro f, String nom, String desc, int PLA, int tiempo) {
		super(nom, desc, PLA, tiempo);
		this.filtro=f;
	}
	
	
	public void addElemento(Elemento e) {
		if(this.filtro.cumple(e)) {
			super.addElemento(e);
		}
	}
}
