package tutsviews.lms.controller;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.glassfish.hk2.external.org.objectweb.asm.xml.SAXAnnotationAdapter;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.author.Author;
import tutsviews.lms.service.AuthorService;
import tutsviews.lms.web.controller.AuthorController;


@ContextConfiguration()
public class AuthorControllerTest extends AbstractTest {
	

	@Mock
	AuthorService authorService;
	
	@Mock
	Logger logger;
	
	private MockMvc mockMvc;
	
	@InjectMocks
	AuthorController authorController = new AuthorController();
	
	@Before
	public void setUp(){
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        MockitoAnnotations.initMocks(this);
		
        mockMvc = MockMvcBuilders.standaloneSetup(authorController).setViewResolvers(viewResolver)
                .build();
	
	
	}
	
	
	
	@Test
	public void test_getAuthors() throws Exception{
		
		List<Author> authors = new ArrayList<>();
		authors.add(new Author());
		authors.add(new Author());
		
		Mockito.when(authorService.getAllAuthors()).thenReturn(authors);
		
		
		mockMvc.perform(get("/authors"))
		.andExpect(status().isOk())
		.andExpect(view().name("authors"))
		.andExpect(model().attribute("authors", is(authors)))
		.andExpect(model().attribute("mode", "MODE_AUTHORS"));
		
	}
	
	@Test
	public void test_addAuthor() throws Exception{
		mockMvc.perform(get("/authors/add"))
		.andExpect(status().isOk())
		.andExpect(view().name("authors"))
		.andExpect(model().attribute("mode", "MODE_NEW_AUTHOR"))
		.andExpect(model().attributeExists("author"));
		
	}
	
}
