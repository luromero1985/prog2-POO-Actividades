package ActividadPatronStrategy;

public class Comida {
    private String tipo;
    private int tiempoDeCoccion; // en minutos
    private String modoDePreparacion;

    public Comida(String tipo, int tiempoDeCoccion, String modoDePreparacion) {
        this.tipo = tipo;
        this.tiempoDeCoccion = tiempoDeCoccion;
        this.modoDePreparacion = modoDePreparacion;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTiempoDeCoccion() {
        return tiempoDeCoccion;
    }

    public String getModoDePreparacion() {
        return modoDePreparacion;
    }

    @Override
    public String toString() {
        return "Comida{" +
               "tipo='" + tipo + '\'' +
               ", tiempoDeCoccion=" + tiempoDeCoccion +
               ", modoDePreparacion='" + modoDePreparacion + '\'' +
               '}';
    }
}

