package dao;

import java.util.List;

import model.Restaurant;


public interface RestaurantDao {
	
	public Restaurant ajouterRestaurant(Restaurant restaurant);
	public List<Restaurant>  rechercherRestaurantparMC (String mc);
	public Restaurant updateRestaurant(Restaurant restaurant);
	public void deleteRestaurant(Long code);
	public Restaurant recherchParCode (Long code);

}
