package demospringdatajpav2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.demospringdatajpav2.dao.IEtudiantDao;
import eu.ensup.demospringdatajpav2.domaine.Etudiant;
import eu.ensup.demospringdatajpav2.service.EtudiantService;

public class TestSpringEtudiantService {

	private Etudiant etudiant;
	private EtudiantService etuService;
	private ClassPathXmlApplicationContext appContext;
	
	@Before
	public void initialisation() {
		etudiant = new Etudiant("KapoorService", "Benjamin");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		
		etuService = (EtudiantService) appContext.getBean("etudiantService");
	}

	@After
	public void destruction() {
		etudiant = null;
		appContext = null;
		etuService = null;
	}

	@Test
	public void saveEtudiantServiceTest() {
		
		etuService.enregistrerEtudiant(etudiant);
		
	}
	
	@Test
	public void findEtudiantByNomServiceTest() {
		List<Etudiant> etudiantList = etuService.findByNom(etudiant.getNom());
		for(Etudiant e : etudiantList) {
			System.out.println(e.getNom());
		}
		assertNotNull(etudiantList);
		System.out.println(etudiantList);
	}

}
