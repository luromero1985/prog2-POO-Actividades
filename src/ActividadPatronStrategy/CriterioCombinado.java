package ActividadPatronStrategy;

public class CriterioCombinado implements CriterioDistribucion{
	
	    private CriterioDistribucion criterio1;
	    private CriterioDistribucion criterio2;

	    public CriterioCombinado(CriterioDistribucion criterio1, CriterioDistribucion criterio2) {
	        this.criterio1 = criterio1;
	        this.criterio2 = criterio2;
	    }

	    @Override
	    public boolean cumpleCriterio(Comida comida) {
	        return criterio1.cumpleCriterio(comida) && criterio2.cumpleCriterio(comida);
	    }
}
