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
        
        while (cursor != null) {
        	if(actual==i) {
        		return cursor.getValor();
        	}
            actual++;
            cursor = cursor.getSiguiente();
        }
         return null;   


    }

	/*
	 * Retorna la cantidad de elementos de la lista
	 */
	
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

    /*
     * Cuando una clase implementa Iterable<T>, está obligada a proporcionar el método iterator(), 
     * que devuelve una instancia de un iterador adecuado
     * */
    @Override
    public Iterator<T> iterator() {
        return new MiIteradorDeLista<T>(primero);
    }
}
