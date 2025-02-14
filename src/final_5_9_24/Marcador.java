package final_5_9_24;

import java.util.ArrayList;
import java.util.Comparator;

public class Marcador extends Categoria {
	private String url;
	private ArrayList<String> pClaves;
	private String nombreUsuario;

	public Marcador(String nombre, String url, String nombreUsuario) {
		super(nombre);
		this.url = url;
		this.pClaves = new ArrayList<>();
		this.nombreUsuario = nombreUsuario;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public void addPClave(String p) {
		if (!this.pClaves.contains(p)) {
			this.pClaves.add(p);
		}
	}

	public ArrayList<String> getPalabrasClave() {
		return new ArrayList<>(this.pClaves);
	}

	public Categoria getCopia(String palabra) {
		if (this.tienePalabraClave(palabra)) {
			Marcador copia = new Marcador(this.getNombre(), this.getUrl(), this.getNombreUsuario());
			ArrayList<String> palabrasClaves = new ArrayList<>(this.pClaves);
			for (String p : palabrasClaves) {
				copia.addPClave(p);
			}
			return copia;
		}
		return null;
	}

	public boolean tienePalabraClave(String p) {
		return this.pClaves.contains(p);
	}

	public int getCantPalabrasClave() {
		return this.pClaves.size();
	}

	public ArrayList<Marcador> getBuscar(Filtro f, Comparator<Marcador> c) {
		ArrayList<Marcador> resultado = new ArrayList<>();
		if (f.filtrar(this)) {
			resultado.add(this);
		}
		return resultado;
	}

	public int getCantidadMarcadores() {
		return 1;
	}
}
