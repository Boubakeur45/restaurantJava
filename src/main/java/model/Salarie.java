package model;

public class Salarie {
	
	
	
	Long id ;
	String nom ;
	String prenom ;
	float salaire;
	
	
	
	
	
	public Salarie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salarie(Long id, String nom, String prenom, float salaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

}
