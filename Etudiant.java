import java.util.*;



public class Etudiant {

	private  String matricule;
	private	 String nom;
	private String prenom;
	private  String naissance;
	 
	Etudiant(){};
	Etudiant( String matricule,String nom,String prenom,String naissance ){
		this.matricule=matricule;
		this.nom=nom;
		this.prenom=prenom;
		this.naissance=naissance;
		 
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String mat) {
		this.matricule = mat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNaissance() {
		return naissance;
	}

	public void setNaissance(String naissance) {
		this.naissance = naissance;
	}

	 
	 
	 

	
	
	


	
	

}