package model;

public class Restaurant {
	
	
	Long	code;
	String	nom;
	String	adresse;
	int	nbr_table ;
	String	statut;
	Salarie[] Tabsalarie;



	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(Long code, String nom, String adresse, int nbr_table, String statut) {
		super();
		this.code = code;
		this.nom = nom;
		this.adresse = adresse;
		this.nbr_table = nbr_table;
		this.statut = statut;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNbr_table() {
		return nbr_table;
	}
	public void setNbr_table(int nbr_table) {
		this.nbr_table = nbr_table;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
}
