package tutsviews.lms.repository;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.media.Image;

public class ImageRepositoryTest extends AbstractTest{
	
	
	@Autowired
	ImageRepository imageRepository;

	
	@Test
	public void searchAll(){
		
		List<Image> images =imageRepository.findAll();
		assertThat(images.size(), greaterThan(0));
		assertThat(images.size(), is(2));
	}
}
