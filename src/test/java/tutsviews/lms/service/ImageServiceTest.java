package tutsviews.lms.service;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.*;
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
import tutsviews.lms.domain.media.Image;
import tutsviews.lms.repository.ImageRepository;
import tutsviews.lms.service.impl.ImageServiceImpl;

public class ImageServiceTest extends AbstractTest {
	
	private static final int IMAGE_ID =1;
	
	@Mock
	ImageRepository imageRepository;
	
	@Mock
	Logger logger;
	
	@InjectMocks
	ImageService imageService = new ImageServiceImpl();
	
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	

	@Test 
	public void createImage_should_create_a_new_image(){
		
		Image imageToBePersisted = new Image();
		Image persistedImage = new Image();
		persistedImage.setId((long) IMAGE_ID);
		
		when(imageRepository.save(any(Image.class))).thenReturn(persistedImage);
		
		assertNotNull(imageService.createImage(imageToBePersisted).getId());
		assertEquals((imageService.createImage(imageToBePersisted)), persistedImage);
		verify(imageRepository,VerificationModeFactory.times(2)).save(imageToBePersisted);
		
	}
	
	
	
	@Test
	public void getAllImages_should_return_all_images(){
		
		List<Image> images = new ArrayList<Image>();
		images.add(new Image());
		images.add(new Image());

		when(imageRepository.findAll()).thenReturn(images);
		
		assertNotNull(imageService.getAllImages().size());
		verify(imageRepository).findAll();
	}


	@Test
	public void getOneImage_shoud_return_one_image(){
		Image image = new Image();
		image.setId((long) IMAGE_ID);
		
		when(imageRepository.getOne(anyLong())).thenReturn(image);
		
		assertEquals(imageService.getOneImage(IMAGE_ID), image);
		verify(imageRepository).getOne((long) IMAGE_ID);
		
	}
	
	
}
