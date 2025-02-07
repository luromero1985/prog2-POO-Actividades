package final_1_03_24;

import java.util.ArrayList;

public class Pedido {
private ArrayList<Comida> elementosPedidos;
private int numeroMesa;
private String mozo;


public Pedido(ArrayList<Comida> elementos, int numeroMesa, String mozo) {
	
	this.elementosPedidos = new ArrayList<>();
	this.numeroMesa = numeroMesa;
	this.mozo = mozo;
}


public int getNumeroMesa() {
	return numeroMesa;
}


public void setNumeroMesa(int numeroMesa) {
	this.numeroMesa = numeroMesa;
}


public String getMozo() {
	return mozo;
}


public void setMozo(String mozo) {
	this.mozo = mozo;
}

public void addElementoPedido(Comida c) {
	elementosPedidos.add(c);
}


public ArrayList<Comida> getElementospedidos(){
	return new ArrayList<Comida>(this.elementosPedidos);

}
}
