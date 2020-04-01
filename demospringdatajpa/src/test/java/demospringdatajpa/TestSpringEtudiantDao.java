package demospringdatajpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.demospringdatajpa.dao.IEtudiantDao;
import eu.ensup.demospringdatajpa.domaine.Etudiant;

public class TestSpringEtudiantDao {

	private Etudiant etudiant;
	private IEtudiantDao etudiantDao;
	private ClassPathXmlApplicationContext appContext;
	
	@Before
	public void initialisation() {
		etudiant = new Etudiant("Kapoor", "Benjamin");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		
		etudiantDao = (IEtudiantDao) appContext.getBean("IEtudiantDao");
	}

	@After
	public void destruction() {
		etudiant = null;
		appContext = null;
		etudiantDao = null;
	}

	@Test
	public void saveEtudiantTest() {
		
		etudiantDao.save(etudiant);
		
		assertEquals("Benjamin", etudiantDao.findOne(1).getPrenom());
	}
	
	@Test
	public void findEtudiantByNomTest() {
		List<Etudiant> etudiantList = etudiantDao.findByNom(etudiant.getNom());
		for(Etudiant e : etudiantList) {
			System.out.println(e.getNom());
		}
		assertNotNull(etudiantList);
		System.out.println(etudiantList);
	}

}
