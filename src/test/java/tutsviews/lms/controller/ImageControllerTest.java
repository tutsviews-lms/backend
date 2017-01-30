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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.course.Course;
import tutsviews.lms.domain.media.Image;
import tutsviews.lms.service.ImageService;
import tutsviews.lms.web.controller.ImageController;

public class ImageControllerTest extends AbstractTest{

	
	
	
	@Mock
	ImageService imageService;
	
	@Autowired
	Logger logger;
	
	@InjectMocks
	ImageController imageController = new ImageController();
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

		MockitoAnnotations.initMocks(this);
		
		mockMvc = MockMvcBuilders
				.standaloneSetup(imageController)
				.setViewResolvers(viewResolver)
				.build();   
		
	}
	
	
	
	@Test
	public void test_getAllImages() throws Exception {
		
		List<Image> images = new ArrayList<Image>();
		images.add(new Image());
		images.add(new Image());
		
		Mockito.when(imageService.getAllImages()).thenReturn(images);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/images"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.view().name("images"))
		.andExpect(MockMvcResultMatchers.model().attribute("images", images))
		.andExpect(MockMvcResultMatchers.model().attribute("mode", "MODE_IMAGES"));
		
	}
	
	
	

	@Test
	public void test_addImage() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/images/add"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.view().name("images"))
		.andExpect(MockMvcResultMatchers.model().attribute("mode", "MODE_NEW_IMAGE"))
		.andExpect(model().attributeExists("image"));
	}
	


	@Test
	public void test_deleteImage() throws Exception{

		Mockito.when(imageService.deleteImage(Mockito.anyInt())).thenReturn(true);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/images/delete?id=1"))
		.andExpect(MockMvcResultMatchers.status().isFound())
		.andExpect(MockMvcResultMatchers.model().attribute("mode", "MODE_IMAGES"));
	
	}

	
	
	@Test
	public void test_updateImage() throws Exception{
		
		Image imageToBeUpdated = new Image();
		
		Mockito.when(imageService.getOneImage(Mockito.anyInt())).thenReturn(imageToBeUpdated);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/images/update?id=1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.model().attribute("mode", "MODE_UPDATE_IMAGE"))
		.andExpect(MockMvcResultMatchers.view().name("images"))
		.andExpect(MockMvcResultMatchers.model().attribute("image", imageToBeUpdated));
		
	}

	
	
	@Test
	public void saveImage_should_return_form_view_with_entries_having_errors() throws Exception{
		
		mockMvc.perform(MockMvcRequestBuilders.post("/images/save")
				.param("nameImage", "")
				.param("urlImage", "")
				.param("uriImage", "")
				.param("widthImage", "this is the description")
				.param("heightImage", "this is the description"))
		.andExpect(MockMvcResultMatchers.view().name("images"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.model().hasErrors())
		.andExpect(MockMvcResultMatchers.model().attribute("mode", "MODE_NEW_IMAGE"));
		
	}
	
	
	
	@Test
	public void saveImage_should_save_image_with_valid_entries() throws Exception{
		
		Mockito.when(imageService.createImage(Mockito.any(Image.class))).thenReturn(new Image());
		
		mockMvc.perform(MockMvcRequestBuilders.post("/images/save")
				.param("nameImage", "valid-entrie")
				.param("urlImage", "valid-entrie")
				.param("uriImage", "valid-entrie")
				.param("widthImage", "56")
				.param("heightImage", "56"))
		.andExpect(MockMvcResultMatchers.status().isFound())
		.andExpect(MockMvcResultMatchers.model().hasNoErrors());
		
		Mockito.verify(imageService).createImage(Mockito.any(Image.class));
		
	}
	
	
	
	
}
