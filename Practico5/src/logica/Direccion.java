package logica;

public class Direccion {
	private String calle, ciudad;
	private int numero;

	public Direccion(String c, int n, String ci) {
		calle = c;
		numero = n;
		ciudad = ci;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return String.format("Direccion: [Calle= %s, Ciudad= %s, Numero= %s]", calle, ciudad, numero);
	}

}
