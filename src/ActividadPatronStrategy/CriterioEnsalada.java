package ActividadPatronStrategy;

public class CriterioEnsalada implements CriterioDistribucion {
    @Override
    public boolean cumpleCriterio(Comida comida) {
        return "ensalada".equalsIgnoreCase(comida.getTipo());
    }
}
