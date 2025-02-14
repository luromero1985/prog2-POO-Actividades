package final_5_9_24;

public class FiltroURL extends Filtro {

	
	private String url;
	
	public FiltroURL(String url) {
		this.url=url;
	}
	@Override
	public boolean filtrar(Marcador m) {
		return m.getUrl().contains(this.url);
	}

}
