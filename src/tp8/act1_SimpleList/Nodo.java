package act1_SimpleList;

public class Nodo <T>{
    private T valor;
    private Nodo<T> siguiente;

    public Nodo (T valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public T getValor() {
        return valor;
    }
    
    public void setValor(T v) {
    	this.valor=v;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
