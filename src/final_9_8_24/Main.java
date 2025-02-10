package final_9_8_24;

public class Main {

	public static void main(String[] args) {

		CasaComidas casa =new CasaComida();
		
		Filtro filtro2=new FiltroContieneIngrediente("sal");
		Filtro filtro1=new FiltroPrecioMenor(5000);
		
		Cliente c1=new Cliente("Diego", 500,filtro1);
		Cliente c2= new Cliente("Ana", 150,filtro2);
		
		Comida comida1= new Comida ("comida1", 40, 4500.0, 350);
		Comida comida2= new Comida ("comida2", 65, 6000.0, 500);
		Comida comida3= new Comida ("comida3", 20, 1500.0, 150);
		
		Compuesto menu= new Compuesto();
		CompuestoRestringido menuRestringido= new CompuestoRestringido(filtro1);
		
		menu.addMenu(comida1);
		menu.addMenu(comida2);
		menu.addMenu(comida3);
		
		menuRestringido.addMenu(comida1);
		menuRestringido.addMenu(comida2);
		menuRestringido.addMenu(comida3);
		
		
	}

}
