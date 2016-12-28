package tutsviews.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.course.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
