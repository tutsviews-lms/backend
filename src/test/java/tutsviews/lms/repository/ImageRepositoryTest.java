package tutsviews.lms.repository;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tutsviews.lms.domain.media.Image;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class ImageRepositoryTest {
	
	
	@Autowired
	ImageRepository imageRepository;

	
	@Test
	public void searchAll(){
		
		List<Image> images =imageRepository.findAll();
		assertThat(images.size(), greaterThan(0));
		assertThat(images.size(), is(2));
	}
}
