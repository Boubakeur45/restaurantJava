package dao;

import java.util.List;

import model.Restaurant;
import model.Salarie;

public class RestaurantDaoImpl implements RestaurantDao {
	

	

	@Override
	public Restaurant ajouterRestaurant(Restaurant restaurant) {
		String SQL_ADD =("INSERT INTO restaurant (code,nom,adresse,nbr_table,statut,)value(?,?,?,?,?)");
	      return restaurant;
	}

	@Override
	public List<Restaurant> rechercherRestaurantparMC(String mc) {
		List<Restaurant> Restaurant = null;
		String SQL_Recherche =("SELECT * FROM restaurant where code LIKE");
		return Restaurant;
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) {
		String SQL_UPDATE =("UPDATE restaurant SET code=?,nom=?,adresse=?,nbr_table=?,staut=? WHERE code=?");
		return restaurant;
	}

	@Override
	public void deleteRestaurant(Long code) {
		String SQL_DELETE=("DELETE FROM restaurant WHERE code=?");
		
	}

	@Override
	public Restaurant recherchParCode(Long code) {
		Restaurant Restaurant = null;
		String SQL_RecherchePar_Code=("SELECT * FROM restaurant WHERE code=?");
		return Restaurant;
	}

}
