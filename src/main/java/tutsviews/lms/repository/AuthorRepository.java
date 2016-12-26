package tutsviews.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{

	 Author findAuthorByEmail(String email);
	
	
	
}
