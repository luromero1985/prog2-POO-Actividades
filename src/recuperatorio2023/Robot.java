package recuperatorio2023;

public class Robot {
private int bateriaDisponible;

public Robot(int batDisp) {
	this.bateriaDisponible=batDisp;
}


public int getBateriaDisponible() {
	return this.bateriaDisponible;
}


public void setBateriaDisponible(int bat) {
	this.bateriaDisponible=bat;
}

public boolean puedeEjecutar(Tarjeta t) {
	return t.getGastoBateria()<=this.getBateriaDisponible();
}

public void descargarBateria(int gasto) {
	this.bateriaDisponible=this.bateriaDisponible-gasto;
	if(this.getBateriaDisponible()<0) {
		this.setBateriaDisponible(0);
	}
}

public String ejecutar(Tarjeta t) {
	if(puedeEjecutar(t)) {
		this.descargarBateria(t.getGastoBateria());
		return t.cantTarjetas()+" - "+t.listaInstrucciones();
	}
	return null;
}
}
