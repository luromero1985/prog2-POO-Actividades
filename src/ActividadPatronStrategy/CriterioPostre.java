package ActividadPatronStrategy;

public class CriterioPostre implements CriterioDistribucion{
	   @Override
	    public boolean cumpleCriterio(Comida comida) {
	        return "postre".equalsIgnoreCase(comida.getTipo());
	    }
}
