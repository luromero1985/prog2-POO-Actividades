package ActividadPatronStrategy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de comidas
        List<Comida> comidas = Arrays.asList(
            new Comida("ensalada", 10, "crudo"),
            new Comida("postre", 5, "horneado"),
            new Comida("plato principal", 20, "frito"),
            new Comida("postre", 15, "frito"),
            new Comida("ensalada", 8, "crudo"),
            new Comida("plato principal", 12, "frito")
        );

        // Crear una estación de trabajo
        EstacionDeTrabajo estacion = new EstacionDeTrabajo();

        // Aplicar diferentes criterios
        System.out.println("Comidas tipo 'ensalada':");
        estacion.setCriterioDistribucion(new CriterioEnsalada());
        System.out.println(estacion.repartirComidas(comidas));

        System.out.println("\nComidas cuyo tiempo de cocción es menor a 15 minutos:");
        estacion.setCriterioDistribucion(new CriterioTiempoCorto());
        System.out.println(estacion.repartirComidas(comidas));

        System.out.println("\nComidas 'fritas' y con tiempo de cocción menor a 10 minutos:");
        estacion.setCriterioDistribucion(new CriterioCombinado(
            new CriterioFrito(),
            new CriterioTiempoCorto()
        ));
        System.out.println(estacion.repartirComidas(comidas));
    }
}
