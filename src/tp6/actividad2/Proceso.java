package tp6.actividad2;

public class Proceso implements Comparable<Proceso>{
private int memoriaReq;

public Proceso(int mr) {
	this.memoriaReq=mr;
}

public int getMemoriaReq() {
	return memoriaReq;
}

public void setMemoriaReq(int memoriaReq) {
	this.memoriaReq = memoriaReq;
}

@Override
public String toString() {
    return ""+memoriaReq;
}

@Override
public int compareTo(Proceso otro){
    return otro.getMemoriaReq()-this.getMemoriaReq();
}

/*
 * public int compareTo(Proceso otro){
    return Integer.compare(otro.getMemoriaReq(), this.getMemoriaReq());
    */
}
