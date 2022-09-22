package logica;

import java.util.Scanner;

public class Alumno {
	//atributos
	private String apellido;
	private String nombre;
	private int grupo;
	private double cuotaBase;
		
	//constructor por defecto
	public Alumno() {
		
	}
	
	//constructor específico
	public Alumno(String ape, String nom, int gru, double cu) {
		apellido=ape;
		nombre=nom;
		grupo=gru;
		cuotaBase=cu;
		
	}
	
	//getter y setter	get:obtener y set:poner
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGrupo() {
		return grupo;
	}
	
	public void setGrupo(int gru) {
		grupo=gru;
	}
	
	public double getCuotaBase() {
		return cuotaBase;
	}
	
	public void setCuotaBase(double cuota) {
		cuotaBase=cuota;
	}
	
		
	
	public double cuotaNeta() {
		double monto = cuotaBase;
		if (grupo == 1 || grupo == 2)
			monto = cuotaBase * 0.60;
		if (grupo == 3 || grupo == 4)
			monto = cuotaBase * 0.80;
		return monto;
	}
	
	//toString
	@Override
	public String toString() {
		return "\n"+apellido+
				"\t"+nombre+
				"\t"+grupo+
				"\t"+cuotaBase+
				"\t"+cuotaNeta();
				
				
		
	}
	
	

}
