package tutsviews.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import tutsviews.lms.domain.course.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	@Query("select c from Category c where c.nameCategory  LIKE LOWER(CONCAT('%', ?1, '%'))")
	List<Category> query( String  searchTerm);


}