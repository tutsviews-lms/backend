package tutsviews.lms.service;

import static org.junit.Assert.*; 
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
	
	private final static int COURSE_ID =1; 
	
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

	 
	@Test 
	public void getOneCourse_should_return_one_course(){
		
		Course course = new Course();
		when(courseRepository.findOne(anyLong())).thenReturn(course);
		
		assertEquals(courseService.getOneCourse(COURSE_ID), course);
		verify(courseRepository,VerificationModeFactory.times(1)).findOne((long) COURSE_ID);
	}
	
	
	@Test 
	public void createCourse_shoud_create_a_new_course(){
		
		Course courseToBeSaved = new Course();
		Course persistedCourse = new Course();
		persistedCourse.setId((long) COURSE_ID);
		
		when(courseRepository.save(any(Course.class))).thenReturn(persistedCourse);
		assertNull(courseToBeSaved.getId());
		courseToBeSaved = courseService.createCourse(courseToBeSaved);
		assertNotNull(courseToBeSaved.getId());
		assertEquals(courseToBeSaved.getId(), persistedCourse.getId());
	}
	
	
	
	@Test 
	public void delete_existing_course_shoulde_delete_a_course_and_return_true(){
		
		Course courseToBeDeleted = new Course();
		courseToBeDeleted.setId((long) COURSE_ID);
		
		when(courseRepository.findOne(anyLong())).thenReturn(courseToBeDeleted);
        doNothing().when(courseRepository).delete(anyLong());
        
        assertTrue(courseService.deleteCourse(COURSE_ID));
        verify(courseRepository,VerificationModeFactory.times(1)).delete((long) COURSE_ID);

	} 
	
	
	@Test
	public void delete_non_existing_Course_should_return_false(){
		
		when(courseRepository.findOne(anyLong())).thenReturn(null);		
		assertFalse(courseService.deleteCourse(COURSE_ID));
		
	}
	
	
}
