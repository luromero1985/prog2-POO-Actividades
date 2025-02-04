package ActividadPatronStrategy;

public class CriterioTiempoCorto implements CriterioDistribucion {
	  @Override
	    public boolean cumpleCriterio(Comida comida) {
	        return comida.getTiempoDeCoccion() < 15;
	    }
}
