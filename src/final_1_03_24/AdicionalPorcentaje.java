package final_1_03_24;

public class AdicionalPorcentaje extends Adicional {

	private double porcentaje;
	
	
	public AdicionalPorcentaje(double porcentaje) {
			this.porcentaje = porcentaje;
	}


	@Override
	public double extra(Comida c) {
		
		return c.getPrecio()*this.getPorcentaje();
	}


	public double getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

}
