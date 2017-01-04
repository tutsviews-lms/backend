package tutsviews.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.util.Personne;

@Repository
public interface PersonneRepository  extends JpaRepository<Personne, Long> {
	
	List<Personne> getPersonneByName(String name);
	
}
