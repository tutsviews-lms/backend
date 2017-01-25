package tutsviews.lms.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.course.Course;
import tutsviews.lms.service.CourseService;
import tutsviews.lms.web.controller.CourseController;

public class CourseControllerTest extends AbstractTest{
	
	@Mock
	CourseService courseService;
	
	@Mock
	Logger logger;
	
	@InjectMocks
	CourseController courseController = new CourseController();
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

		MockitoAnnotations.initMocks(this);
		
		mockMvc = MockMvcBuilders
				.standaloneSetup(courseController)
				.setViewResolvers(viewResolver)
				.build();   
		
	}

	
	@Test
	public void test_getAllCourses() throws Exception {
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(new Course());
		courses.add(new Course());
		
		Mockito.when(courseService.getAllCourses()).thenReturn(courses);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/courses"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.view().name("courses"))
		.andExpect(MockMvcResultMatchers.model().attribute("courses", courses))
		.andExpect(MockMvcResultMatchers.model().attribute("mode", "MODE_COURSES"));
		
	}
	
	
	
	@Test
	public void test_addCourse() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/courses/add"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.view().name("courses"))
		.andExpect(MockMvcResultMatchers.model().attribute("mode", "MODE_NEW_COURSE"))
		.andExpect(model().attributeExists("course"));

		
	}
	
	

	
}
