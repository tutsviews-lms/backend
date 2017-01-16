package tutsviews.lms.repository;

import java.util.List;

import javax.validation.constraints.AssertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.course.Course;


@Transactional
public class CourseRepositoryTest extends AbstractTest {
	
	@Autowired
	CourseRepository courseRepository;
	
	
	@Test
	public void search_NoCourseEntriesFound_ShouldReturnEmptyList(){
		List<Course> courses = courseRepository.findCoursesByNameCourse("NOT_FOUND");
		assertThat(courses.size(), is(0));
		
		
	}

}
