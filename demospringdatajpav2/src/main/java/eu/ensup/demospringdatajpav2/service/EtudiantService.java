package eu.ensup.demospringdatajpav2.service;

import java.util.List;

import eu.ensup.demospringdatajpav2.dao.IEtudiantDao;
import eu.ensup.demospringdatajpav2.domaine.Etudiant;

public class EtudiantService {
	private IEtudiantDao iEtudiantDao;
	
	public IEtudiantDao getiEtudiantDao() {
		return iEtudiantDao;
	}

	public void setiEtudiantDao(IEtudiantDao iEtudiantDao) {
		this.iEtudiantDao = iEtudiantDao;
	}

	public Etudiant enregistrerEtudiant(Etudiant etudiant) {
		return iEtudiantDao.save(etudiant);
	}
	
	public List<Etudiant> findByNom(String nom){
		return iEtudiantDao.findByNom(nom);
	}
}
