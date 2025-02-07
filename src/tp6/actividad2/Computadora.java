package tp6.actividad2;

public class Computadora implements Comparable<Computadora>{
private int memoria;
private double velocidad;
private String nombre;
private Proceso ejecutando;




public Computadora( String nombre, int memoria, double velocidad) {
	this.memoria = memoria;
	this.velocidad = velocidad;
	this.nombre = nombre;
}


public int getMemoria() {
	return memoria;
}
public void setMemoria(int memoria) {
	this.memoria = memoria;
}
public double getVelocidad() {
	return velocidad;
}
public void setVelocidad(double velocidad) {
	this.velocidad = velocidad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String toString(){
    return this.getNombre() +
            " (vel="+this.getVelocidad()+
            " mem="+this.getMemoria()+")";
}


public void asignarProceso(Proceso proc) {
    ejecutando = proc;
}

public boolean estaLibre(){
    return ejecutando==null;
}

public void liberarComputadora(){
    this.ejecutando = null;
}


@Override
public int compareTo(Computadora otro) {
    if (this.getVelocidad()>otro.getVelocidad())
        return -1;
    else if (this.getVelocidad()<otro.getVelocidad())
            return 1;
    else {
        return this.getMemoria() - otro.getMemoria(); // Compara por memoria si la velocidad es igual
    }
    //return (int) this.getVelocidad() - (int) otro.getVelocidad();
    //return this.getNombre().compareTo(otro.getNombre());
}

}
