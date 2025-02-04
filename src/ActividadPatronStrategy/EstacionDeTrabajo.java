package ActividadPatronStrategy;

import java.util.ArrayList;
import java.util.List;

public class EstacionDeTrabajo {
    private CriterioDistribucion criterioDistribucion;

    public void setCriterioDistribucion(CriterioDistribucion criterioDistribucion) {
        this.criterioDistribucion = criterioDistribucion;
    }

    public List<Comida> repartirComidas(List<Comida> comidas) {
        List<Comida> seleccionadas = new ArrayList<>();
        for (Comida comida : comidas) {
            if (criterioDistribucion.cumpleCriterio(comida)) {
                seleccionadas.add(comida);
            }
        }
        return seleccionadas;
    }
}
