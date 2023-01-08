package Ex01;

import java.util.Comparator;

public class Persona implements Comparator<Persona>{
	
	private String nom;
	private String cognom;
	private String dni;
	
	public Persona() {
		
	}
	public Persona(String nom,String cognoms,String dni) {
		this.nom=nom;
		this.cognom=cognoms;
		this.dni=dni;
	}
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String toString() {
		
		return String.format("%-20s %-20s %-20s",nom, cognom,dni);
		
		
		
	}
	
	

	@Override
	public int compare(Persona o1, Persona o2) {
		String nom1;
		String nom2;
		nom1=o1.nom;
		nom2=o2.nom;
		return nom1.compareTo(nom2);
	}

}
