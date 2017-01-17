package tutsviews.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tutsviews.lms.domain.course.Course;
import tutsviews.lms.repository.CourseRepository;
import tutsviews.lms.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;

	
	public List<Course> getAllCourses() {
  		return courseRepository.findAll();
	}

	public Course getOneCourse(int id) {
		return courseRepository.findOne((long) id);
	}

	public void saveCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(int id) {
		courseRepository.delete((long) id);
	}

	
	
	
}
