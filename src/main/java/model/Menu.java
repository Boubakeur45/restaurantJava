package model;

public class Menu {

	Long id;
	String nom ;
	float prix;
	String code_restaurant;
	
	
		
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(Long id, String nom, float prix, String code_restaurant) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.code_restaurant = code_restaurant;
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
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getCode_restaurant() {
		return code_restaurant;
	}
	public void setCode_restaurant(String code_restaurant) {
		this.code_restaurant = code_restaurant;
	}

}
