package tutsviews.lms.repository;

import java.util.List; 

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.util.Personne;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;


public class PersonneRepositoryTest extends AbstractTest {

	  @Autowired
	    private PersonneRepository personneRepository;
	
	  
	  @Test
	  public void findPersonneByNameTunisia(){
		  List<Personne> personnes = personneRepository.getPersonneByName("TUNISIA");
		  assertThat(personnes.size(), is(1));
		  
	  }
	
	  
	  @Test
	  public void findPersonneByNameAustralia(){
		  List<Personne> personnes = personneRepository.getPersonneByName("Australia");
		  assertThat(personnes.size(), is(3));
		  
	  }
}
