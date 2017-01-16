package tutsviews.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.course.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{

	List<Course> findCoursesByNameCourse(String nameCourse);
	
	
}
