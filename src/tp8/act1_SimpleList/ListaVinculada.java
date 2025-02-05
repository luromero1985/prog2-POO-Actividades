package act1_SimpleList;

import java.util.Iterator;

public class ListaVinculada<T> implements SimpleList<T>, Iterable<T> {
	private Nodo<T> primero, ultimo;
	private int size = 0;

	public ListaVinculada() {
		primero = null;
		ultimo = null;
	}

	/*
	 * Retorna true si la lista no contiene elementos y false si contiene al menos
	 * un elemento
	 */

	@Override
	public boolean isEmpty() {
		return primero == null;
	}

	/*
	 * ● boolean contains(Object element); Retorna true si la lista contiene al
	 * objeto o pasado como parámetro
	 */

	@Override
	public boolean contains(T element) {
		Node<T> actual = primero;
		while (actual != null) {
			if (actual.getValor().equals(element)) {
				return true;
			} else {
				actual = actual.getSiguiente();
			}
		}
		return false;
	}

	/*
	 * Agrega el objeto o al final de la lista
	 */
	@Override
	public void add(T elemento) {
		Nodo<T> nuevo = new Nodo<>(elemento);
		if (isEmpty()) {
			primero = nuevo;
			ultimo=primero;
		} else {
			ultimo.setSiguiente(nuevo);
			ultimo = nuevo;
		}
		size++;
	}

	/*
	 * ● Object add(int index, Object element); Agrega el objeto element en la
	 * posición index pasada como parámetro. Se realizan los corrimientos necesarios
	 * con los elementos posteriores a dicha posición. Si la posición index no
	 * existe retorna null, caso contrario retorna el mismo objeto agregado.
	 */
	@Override
	public T add(int index, T element) {
		if (index < 0 || index > this.size()) {
			return null;
		}

		Nodo<T> nuevo = new Nodo<>(element);

		if (index == 0) { // insertar al inicio
			nuevo.setSiguiente(primero);
			primero = nuevo;
			if (size == 0) { // Si la lista esta vacía
				ultimo = nuevo;
			}
		} else if (index == size) { // insertar al final
			ultimo.setSiguiente(nuevo);
			ultimo = nuevo;
		} else { // inserta al medio
			Nodo<T> actual = primero;
			int cursor = 0;

			while (cursor < index - 1) {
				actual = actual.getSiguiente();
				cursor++;
			}
			nuevo.setSiguiente(actual.getSiguiente());
			actual.setSiguiente(nuevo);
		}
		this.size++;
		return element;

	}
	/*
	 * ● Object set(int index, Object element); Similar al método anterior, pero se
	 * sobreescribe el elemento existente en la posición index. El elemento que
	 * anteriormente ocupaba la posición index es retornado al usuario. Si la
	 * posición index no existe retorna null.
	 */

	/*
	 * ● boolean remove(Object element); Elimina la primera ocurrencia del objeto
	 * element pasado como parámetro. Si el objeto no se encontró, retorna false.
	 * Caso contrario retorna true.
	 */

	/*
	 * ● Object remove(int index); Elimina el objeto que ocupa la posición index
	 * pasada como parámetro y lo retorna al usuario. Si no existe, retorna null.
	 */
	@Override
	public T remove(int index) {
		if (index < 0 || index >= this.size()) {
			return null;
		}

		T encontrado;

		if (index == 0) { //eliminar el primer nodo
			encontrado = primero.getValor();
			primero = primero.getSiguiente();

			if (primero == null) {
				ultimo = null;
			}
		} else { //eliminar en medio o final
			Nodo<T> actual = primero;
			Nodo<T> anterior = null;
			int cursor = 0;
			
			while (cursor < index) {
				anterior = actual;
				actual = actual.getSiguiente();
				cursor++;
			}
			
			encontrado = actual.getValor();

			if (actual == ultimo) {  //eliminar el último nodo
				ultimo = anterior;
			}
			anterior.setSiguiente(actual.getSiguiente());
		}
		
		this.size--;
		return encontrado;
	}
	/*
	 * ● void addAll(List otherList); Agrega todos los elementos de la lista
	 * otherList pasada como parámetro al final de la lista que recibe el mensaje
	 */

	/*
	 * ● void clear(); Elimina todos los elementos de la lista
	 */

	@Override
	public void clear() {
		this.primero = null;
		this.size = 0;
	}

	/*
	 * 
	 * ● int indexOf(Object element); Retorna la posición (índice) en la que se
	 * encuentra el objeto element pasado como parámetro. Si el objeto no existe en
	 * la lista, retorna -1
	 */
	@Override
    public int indexOf(T element) {
    	int indice=0;
    	Nodo<T> actual=primero;
    	while(actual!=null) {
    		if(element!=null && actual.getValor().equals(element)) {
    			return indice;
    		}else {
    			indice++;
    			actual=actual.getSiguiente();
    		}
    	}
    	return -1;
    }

	/*
	 * ● Object get(int index); Retorna el objeto almacenado en la posición index.
	 * Si no existe la posición retorna null;
	 */
	@Override
	public T get(int i) {
		int actual = 0;
		Nodo<T> cursor = primero;

		while (cursor != null) {
			if (actual == i) {
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
		/*
		 * int i = 0; Nodo<T> cursor = primero; while (cursor!=null){ i++; cursor =
		 * cursor.getSiguiente(); } return i;
		 */
		return this.size;
	}

	/*
	 * Cuando una clase implementa Iterable<T>, está obligada a proporcionar el
	 * método iterator(), que devuelve una instancia de un iterador adecuado
	 */
	@Override
	public Iterator<T> iterator() {
		return new MiIteradorDeLista<T>(primero);
	}
}
