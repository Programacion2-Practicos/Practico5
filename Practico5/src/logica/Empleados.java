package logica;

import java.util.ArrayList;

public class Empleados {
	ArrayList<Empleado> listaEmpleados;

	public Empleados() {
		listaEmpleados = new ArrayList<>();
	}

	public void agregar(Empleado e) {
		listaEmpleados.add(e);
	}

	public void eliminar(int i) {
		listaEmpleados.remove(i);
	}

	public int size() {
		return listaEmpleados.size();
	}

	public Empleado devolver(int i) {
		return listaEmpleados.get(i);
	}

	public double obtenerTotalSalarios() {
		double total = 0;
		for (int i = 0; i < listaEmpleados.size(); i++) {
			total = listaEmpleados.get(i).getSalario();
		}
		return total;
	}

	public int cantidadVendedores() {
		int cant = 0;
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i) instanceof Vendedor)
				cant++;
		}
		return cant;
	}

	@Override
	public String toString() {
		return String.format("Lista de Empleados:%s\nTotal de Salarios= %s\nCantidad de Vendedores= %s",
				listaEmpleados, obtenerTotalSalarios(), cantidadVendedores());
	}

}
