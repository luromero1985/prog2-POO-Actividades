package act1_SimpleList;

import java.util.Iterator;

public class ListaVinculada <T> implements SimpleList<T>, Iterable<T>{
	private Nodo<T> primero, ultimo;

    public ListaVinculada() {
        primero=null;
        ultimo=null;
    }

    @Override
    public boolean isEmpty() {
        return primero==null;
    }

    @Override
    public void add(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (isEmpty()){
            primero = nuevo;
        }
        else
            ultimo.setSiguiente(nuevo);
        ultimo = nuevo;
    }

    @Override
    public T get(int i) {
        int actual = 0;
        Nodo<T> cursor = primero;
        while (cursor != null && actual < i) {
            actual++;
            cursor = cursor.getSiguiente();
        }
        if (cursor == null)
            return null;
        else
            return cursor.getValor();


    }

    @Override
    public int size() {
        int i = 0;
        Nodo<T> cursor = primero;
        while (cursor!=null){
            i++;
            cursor = cursor.getSiguiente();
        }
        return i;
    }

    @Override
    public Iterator<T> iterator() {
        return new MiIteradorDeLista<T>(primero);
    }
}
