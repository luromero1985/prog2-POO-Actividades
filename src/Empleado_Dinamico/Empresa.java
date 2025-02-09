package Empleado_Dinamico;

public class Empresa {

	public static void main(String[] args) {


		Empleado e1 = new Empleado("juan", new SueldoFijo(200));
		Empleado e2 = new Empleado("juan2", new HorasExtras(200,3));
		
		System.out.println(e1.getSueldo());
		System.out.println(e2.getSueldo());
		
		e2.setFp(new SueldoFijo(300));
		
		System.out.println(e1.getSueldo());
		System.out.println(e2.getSueldo());
		
		
		SueldoFijo sf1 = new SueldoFijo(150);
		HorasExtras hs = new HorasExtras(100, 2);
		
		SumaPagos sm1 = new SumaPagos(sf1, hs);
		
		ComisionVentas cm1 = new ComisionVentas(20000, 0.01);
		
		 SumaPagos sm2 = new SumaPagos(sm1, cm1);
		
		e1.setFp(sm2);
		
		System.out.println(e1.getSueldo());
		System.out.println(e2.getSueldo());
		
		
		
		
	}

}
