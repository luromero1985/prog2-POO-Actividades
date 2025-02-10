package final_9_8_24;

public class CasaComidas {
	
	private Cliente cliente;
	
	public CasaComidas(Cliente cliente) {
		this.cliente=cliente;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public boolean recomendacion(Comida c) {
		return this.cliente.leGusta(c) && !this.cliente.getComidasSolicitadas().contains(c);
	}
	
	


}
