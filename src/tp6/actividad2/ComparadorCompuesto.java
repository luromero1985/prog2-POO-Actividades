package tp6.actividad2;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Computadora> {
    private Comparator<Computadora> primerCriterio, segundoCriterio;

    public ComparadorCompuesto(Comparator<Computadora> primerCriterio, Comparator<Computadora> segundoCriterio) {
        this.primerCriterio = primerCriterio;
        this.segundoCriterio = segundoCriterio;
    }

    @Override
    public int compare(Computadora o1, Computadora o2) {
        int res = primerCriterio.compare(o1, o2);
        if (res!=0)
            return res;
        else return segundoCriterio.compare(o1,o2);
    }

}
