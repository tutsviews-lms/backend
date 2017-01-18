package tutsviews.lms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tutsviews.lms.domain.course.Course;

@Transactional
public interface CourseService {

	
	List<Course> getAllCourses();
	
	Course getOneCourse(int id);
	
	void saveCourse(Course course);
	
	void deleteCourse(int id);	
}
