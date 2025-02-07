package tp6.actividad2;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Computadora> {
    @Override
    public int compare(Computadora c1, Computadora c2) {
        return c1.getNombre().compareTo(c2.getNombre());
    }

}
