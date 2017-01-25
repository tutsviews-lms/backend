package tutsviews.lms.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.web.controller.HomeController;

public class HomeControllerTest extends AbstractTest {

	
	@Autowired
	Logger logger;
	
	private MockMvc mockMvc;
	
	@InjectMocks
	HomeController homeController = new HomeController();
	
	@Before
	public void setUp(){
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        MockitoAnnotations.initMocks(this);
		
        mockMvc = MockMvcBuilders.standaloneSetup(homeController).setViewResolvers(viewResolver)
                .build();
	
	
	}
	
	
	@Test
	public void test_home() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.view().name("index"));
		
	}
	
	
}
