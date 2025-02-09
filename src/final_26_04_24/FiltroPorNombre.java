package final_26_04_24;

public class FiltroPorNombre extends Filtro {
private String nombre;

public FiltroPorNombre(String n) {
	this.nombre=n;
}
	@Override
	public boolean cumple(Pasajero t) {
		return t.getNombre().contains(this.nombre);
	}

}
