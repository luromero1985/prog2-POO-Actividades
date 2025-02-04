package ActividadPatronStrategy;

public class CriterioFrito implements CriterioDistribucion {
    @Override
    public boolean cumpleCriterio(Comida comida) {
        return "frito".equalsIgnoreCase(comida.getModoDePreparacion());
    }
}
