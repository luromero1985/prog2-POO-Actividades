package act1_SimpleList;

import java.util.Iterator;

public class MiIteradorDeLista <T> implements Iterator<T>{
	private Nodo<T> actual;
	
    public MiIteradorDeLista(Nodo<T> primero) {
        actual = primero;
    }

    @Override

    public boolean hasNext() {
        return actual!=null;
    }

    @Override
    public T next() {
        if (hasNext()) {
            T valor = actual.getValor();
            actual = actual.getSiguiente();
            return valor;
        }
        return null;
    }
}
