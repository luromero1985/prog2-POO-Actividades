package act1_SimpleList;

public class MainSimpleList {
	/*
	 *  Listas
	Definir una interfaz similar a la interfaz List de Java, llamada SimpleList, que defina los
	siguientes métodos:
	● int size();
	Retorna la cantidad de elementos de la lista
	● boolean isEmpty();
	Retorna true si la lista no contiene elementos y false si contiene al menos un elemento
	● boolean contains(Object element);
	Retorna true si la lista contiene al objeto o pasado como parámetro
	● void add(Object element);
	Agrega el objeto o al final de la lista
	● Object add(int index, Object element);
	Agrega el objeto element en la posición index pasada como parámetro.
	Se realizan los corrimientos necesarios con los elementos posteriores a dicha posición. Si la posición index no existe retorna null, caso
	contrario retorna el mismo objeto agregado.
	● Object set(int index, Object element);
	Similar al método anterior, pero se sobreescribe el elemento existente en la posición index. El elemento que anteriormente ocupaba la
	posición index es retornado al usuario. Si la posición index no existe retorna null.
	● boolean remove(Object element);
	Elimina la primera ocurrencia del objeto element pasado como parámetro. Si el objeto no se encontró, retorna false. Caso contrario
	retorna true.
	● Object remove(int index);
	Elimina el objeto que ocupa la posición index pasada como parámetro y lo retorna al usuario. Si no existe, retorna null.
	● void addAll(List otherList);
	Agrega todos los elementos de la lista otherList pasada como parámetro 	al final de la lista que recibe el mensaje
	● void clear();
	Elimina todos los elementos de la lista
	● Object get(int index);
	Retorna el objeto almacenado en la posición index. Si no existe la
	posición retorna null;
	● int indexOf(Object element);
	Retorna la posición (índice) en la que se encuentra el objeto element pasado como parámetro. Si el objeto no existe en la lista, retorna -1

	Codificar dos implementaciones de esta interfaz:
	1. Una lista vinculada, en la cual cada objeto se almacena en un Nodo que conoce el
	siguiente elemento de la lista. La lista almacena únicamente una referencia al primer y
	último elemento de la lista. Los demás elementos quedan referenciados a partir del
	primero.

	2. Una lista basada en arreglos. Cuando se crea la lista, se inicializa un arreglo de
	tamaño predefinido que se va utilizando para almacenar los elementos que se insertan
	en la lista. Cuando este arreglo se completa, la estructura automáticamente crea un
	nuevo arreglo del doble del tamaño actual, conteniendo los elementos existentes. De
	esta forma tiene espacio disponible para agregar más elementos.
	
	*/
	public static void main(String[] args) {
		ListaVinculada<String> lista = new ListaVinculada<>();
		lista.add("A");
		lista.add("B");
		lista.add("C");

		System.out.println(lista.indexOf("B")); // Devuelve 1
		System.out.println(lista.indexOf("X")); // Devuelve -1
		System.out.println(lista.indexOf(null)); // No lanza error, devuelve -1
		

		lista.add(0, "D");
		lista.add(4, "E");
		lista.add(5, "F");

		System.out.println(lista.size()); // 6
		System.out.println(lista.remove(1));
		lista.remove(1); // Elimina "B"

		System.out.println(lista.size()); // 5
		System.out.println(lista.remove("E"));
		lista.remove("E"); // Elimina "E"
		
		System.out.println(lista.size()); // 4
	}

}
