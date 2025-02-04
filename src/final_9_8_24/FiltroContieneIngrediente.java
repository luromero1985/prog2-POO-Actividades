package final_9_8_24;

public class FiltroContieneIngrediente extends Filtro {

	private String ingrediente;

	public FiltroContieneIngrediente(String i) {
		this.ingrediente=i;
	}
	
	
	@Override
	public boolean cumple(Menu menu) {
		return menu.listaIngredientes().contains(this.ingrediente);
	}

}
