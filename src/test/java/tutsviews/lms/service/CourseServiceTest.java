package tutsviews.lms.service;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.VerificationModeFactory;
import org.slf4j.Logger;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.course.Course;
import tutsviews.lms.repository.CourseRepository;
import tutsviews.lms.service.impl.CourseServiceImpl;

public class CourseServiceTest extends AbstractTest {
	
	@Mock
	CourseRepository courseRepository;
	
	@Mock
	Logger logger;
	
	@InjectMocks
	CourseService courseService = new CourseServiceImpl();
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Test
	public void getAllCourses_shoud_return_all_courses(){
		
		List<Course> courses =new ArrayList<>();
		courses.add(new Course());
		courses.add(new Course());

		when(courseRepository.findAll()).thenReturn(courses);
		
		assertEquals(courseRepository.findAll().size(), courses.size());
		verify(courseRepository,VerificationModeFactory.times(1)).findAll();
	}

}
