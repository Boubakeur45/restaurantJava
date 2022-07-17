package control;


import java.util.Scanner;
import model.Restaurant;
import model.Salarie;

public class main {

	public static void main(String[] args) {
	
		 System.out.println("Lancement de l'application restaurant");
		 
		
		 Scanner input=new Scanner(System.in);
		 Salarie ajoutersalarie=new Salarie();
		 
		 System.out.println("Nom du salarie à ajouter ? ");
		 ajoutersalarie.setNom(input.nextLine());
		 System.out.println("Prenom du salarie à ajouter ? ");
		 ajoutersalarie.setPrenom(input.nextLine());
		 System.out.println("Salaire du salarie à ajouter ? ");
		 ajoutersalarie.setSalaire(input.nextFloat());
		 System.out.println("======= Ajouter avec succée ========== ");
		 System.out.println("Nom :"+ajoutersalarie.getNom());
		 System.out.println("Prenom :"+ajoutersalarie.getPrenom());
		 System.out.println("Salaire :"+ajoutersalarie.getSalaire());
		 

	}

}
