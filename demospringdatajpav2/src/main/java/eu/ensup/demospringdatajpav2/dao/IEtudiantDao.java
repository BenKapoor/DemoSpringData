package eu.ensup.demospringdatajpav2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.ensup.demospringdatajpav2.domaine.Etudiant;

public interface IEtudiantDao extends JpaRepository<Etudiant, Integer>{
	
	public List<Etudiant> findByNom(String nom);
}
