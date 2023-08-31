package logica;

public class Vendedor extends Empleado {
	private double comision;
	private int ventasRealizadas;

	public Vendedor(String n, double s, Direccion d, double c, int vR) {
		super(n, s, d);
		comision = c;
		ventasRealizadas = vR;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public int getVentasRealizadas() {
		return ventasRealizadas;
	}

	public void setVentasRealizadas(int ventasRealizadas) {
		this.ventasRealizadas = ventasRealizadas;
	}

	@Override
	

	public double calcularImpuesto() {
		double r = super.getSalario() * 0.30;
		return r;
	}

	@Override
	public String toString() {
		return String.format(
				"%s, Comision= %s, Ventas Realizadas= %s, Impuesto= %s, Comisi�n= %s",
				super.toString(), comision, ventasRealizadas, calcularImpuesto(), calcularComision());
	}

	public double calcularComision() {
		double v = ventasRealizadas * 0.20;
		return v;
	}

}
