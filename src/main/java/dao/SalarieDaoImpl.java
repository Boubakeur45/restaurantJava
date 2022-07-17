package dao;

import java.util.List;

import model.Salarie;

public class SalarieDaoImpl implements SalarieDao {

   
	@Override
	public Salarie ajouterSalarie(Salarie salarie) {
		
	  String SQL_ADD =("INSERT INTO salarie (nom,prenom,salaire)value(?,?,?)");
	      return salarie;
	}

	@Override
	public List<Salarie> rechercherSalarieparMC(String mc) {
		List<Salarie> Salarie = null;
		String SQL_Recherche =("SELECT * FROM salarie where nom LIKE ? OR prenom LIKE ?");
		return Salarie;
	}

	@Override
	public Salarie updateSalarie(Salarie salarie) {
		String SQL_UPDATE =("UPDATE salarie SET nom=?,prenom=?,salaire=? WHERE id=?");
		return salarie;
	}

	@Override
	public void deleteSalarie(Long id) {
		String SQL_DELETE=("DELETE FROM salarie WHERE id=?");
		
	}

}
