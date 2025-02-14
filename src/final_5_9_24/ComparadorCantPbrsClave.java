package final_5_9_24;

import java.util.Comparator;

public class ComparadorCantPbrsClave implements Comparator<Marcador> {

	public int compare(Marcador m1, Marcador m2) {
		return Integer.compare(m1.getCantPalabrasClave(), m2.getCantPalabrasClave());

	}
}