package final_1_03_24;

import java.util.ArrayList;

public class Pasteleria {

	private ArrayList<Estacion> estaciones;
	private Adicional adic;
	
	public Pasteleria(Adicional a) {
		this.adic=a;
		this.estaciones = new ArrayList<>();

	}


	public void addEstacion(Estacion e) {
		if (!estaciones.contains(e)) {
			estaciones.add(e);
		}
	}

	public void asignarComidaEstacion(Pedido p) {

		for (Comida c : p.getElementospedidos()) {
			int j = 0;
			while (j < this.estaciones.size() && !this.estaciones.get(j).puedoPreparar(c)) {
				j++;
			}
			if (j < this.estaciones.size() && this.estaciones.get(j).puedoPreparar(c)) {
				this.estaciones.get(j).elaboracionAsignada(c);
			
			}
		}
	}


	public Adicional getAdic() {
		return adic;
	}


	public void setAdic(Adicional adic) {
		this.adic = adic;
	}
	
	
	
	public double costoTotal(Pedido p) {
		int suma=0;
		for(Comida c : p.getElementospedidos()) {
			suma+=c.getPrecio()+this.getAdic().extra(c);
		}
		return suma;
		}
	}


