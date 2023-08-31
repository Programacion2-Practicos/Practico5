package consola;

import logica.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direccion d1 = new Direccion("Patana", 147, "Juan Lopez");
		Direccion d2 = new Direccion("William", 201, "Tristan Narvaja");
		Direccion d3 = new Direccion("Tulio Trivi�o", 19, "Mercedes");
		Direccion d4 = new Direccion("Juanin Juan Harry", 100, "Mauricio Conan");
		Direccion d5 = new Direccion("Carlos", 528, "Roosevelt");
		Direccion d6 = new Direccion("Mag�ito", 231, "Liber Arse");

		Empleado e1 = new Empleado("Miguel", 29200, d1);
		Empleado e2 = new Empleado("Pepe", 40000, d2);
		Empleado e3 = new Empleado("Lala", 35000, d3);
		Vendedor v1 = new Vendedor("Snoopy", 23230, d4, 234, 3000);
		Vendedor v2 = new Vendedor("Elisa", 29920, d5, 400, 4010);
		Vendedor v3 = new Vendedor("Joseph", 30100, d6, 100, 3200);
		Empleados em = new Empleados();
		
		em.agregar(e1);
		em.agregar(v1);
		em.agregar(e2);
		em.agregar(v2);
		em.agregar(e3);
		em.agregar(v3);
		
		System.out.println(em.toString());
		em.eliminar(1);
		System.out.println("Se elimin� a un vendedor de la lista\n" + em.cantidadVendedores());
	}

}
