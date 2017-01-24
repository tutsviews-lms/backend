package tutsviews.lms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tutsviews.lms.domain.course.Course;
import tutsviews.lms.repository.CourseRepository;
import tutsviews.lms.service.CourseService;


@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired 
	CourseRepository courseRepository;
	
	@Autowired
	Logger logger;

	
	public List<Course> getAllCourses() {
  		return courseRepository.findAll(); 
	}

	public Course getOneCourse(int id) {
		return courseRepository.findOne((long) id);
	}

	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}

	public boolean deleteCourse(int id) {
		if (!(courseRepository.findOne((long) id)==null)) {
			courseRepository.delete((long) id);
			logger.info("Course with id "+id +" have been deleted.");
			return true;
		}else
			logger.error("cannot delete course with id "+id);
			return false;
	}

	
	
	
}
