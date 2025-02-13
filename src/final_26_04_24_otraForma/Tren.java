package final_26_04_24_otraForma;

import java.util.ArrayList;

public abstract class Tren {
	public abstract ArrayList<Asiento> lugaresDisponibles(Persona p);
	public abstract int cantAsientos();
	public abstract Tren copiaMia(Condicion c);

}
