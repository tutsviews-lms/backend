package tutsviews.lms.service;


import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
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
	
	
	
	
}
