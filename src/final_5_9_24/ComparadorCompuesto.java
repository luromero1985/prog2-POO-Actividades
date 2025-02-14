package final_5_9_24;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Marcador> {

	private Comparator<Marcador> c1, c2;

	public ComparadorCompuesto(Comparator<Marcador> c1, Comparator<Marcador> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	public int compare(Marcador m1, Marcador m2) {
		// Primero se compara con c1
		int result = c1.compare(m1, m2);

		// Si c1 devuelve 0, se compara con c2
		if (result == 0) {
			result = c2.compare(m1, m2);
		}

		return result;
	}
}
