package tutsviews.lms.service;

import java.util.List;

import tutsviews.lms.domain.course.Course;

public interface CourseService {

	
	List<Course> getAllCourses();
	
	Course getOneCourse(int id);
	
	void saveCourse(Course course);
	
	void deleteCourse(int id);	
}
