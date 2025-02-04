package act1_SimpleList;

public interface SimpleList <T> {

		public abstract boolean isEmpty();
		public abstract void add(T elemento);
		public abstract T get(int i);
		public abstract int size();
		public abstract int indexOf(T element)
		public abstract void clear();
		
		
		/*
		 * todos los metodos son implicitamente public y abstract, por lo que no es obligarorio escribirlo, podemos poner:
		 * boolean isEmpty();
		 * en vez de 
		 * public abstract boolean isEmpty();
		 */
		
	}
