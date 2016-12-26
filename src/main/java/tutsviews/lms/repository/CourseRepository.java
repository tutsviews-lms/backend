package tutsviews.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{

}
