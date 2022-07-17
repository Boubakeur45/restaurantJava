package dao;

import java.util.List;

import model.Salarie;

public interface SalarieDao {
	
	
	public Salarie ajouterSalarie(Salarie salarie);
	public List<Salarie>  rechercherSalarieparMC (String mc);
	public Salarie updateSalarie(Salarie salarie);
	public void deleteSalarie(Long id);
    
}
