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
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
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
	
	

	@Test
	public void test_deleteCourse() throws Exception{

		Mockito.when(courseService.deleteCourse(Mockito.anyInt())).thenReturn(true);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/courses/delete?id=1"))
		.andExpect(MockMvcResultMatchers.status().isFound())
		.andExpect(MockMvcResultMatchers.model().attribute("mode", "MODE_COURSES"));
	
	}

	
	@Test
	public void test_updateCourse() throws Exception{
		
		Course courseToBeUpdated = new Course();
		
		Mockito.when(courseService.getOneCourse(Mockito.anyInt())).thenReturn(courseToBeUpdated);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/courses/update?id=1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.model().attribute("mode", "MODE_NEW_COURSE"))
		.andExpect(MockMvcResultMatchers.view().name("courses"))
		.andExpect(MockMvcResultMatchers.model().attribute("course", courseToBeUpdated));
		
	}
	
	
	
	@Test
	public void saveCourse_should_return_form_view_with_entries_having_errors() throws Exception{
		
		mockMvc.perform(MockMvcRequestBuilders.post("/courses/save")
				.param("nameCourse", "")
				.param("titleCourse", "this is the title")
				.param("difficulty", "HARD")
				.param("description", "this is the description"))
		.andExpect(MockMvcResultMatchers.view().name("courses"))
		.andExpect(MockMvcResultMatchers.model().hasErrors())
		.andExpect(MockMvcResultMatchers.model().attribute("mode", "MODE_NEW_COURSE"));
		
	}
	
	


}
