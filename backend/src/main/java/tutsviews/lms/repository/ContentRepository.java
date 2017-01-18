package tutsviews.lms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.course.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content,Long>  {

	
}
