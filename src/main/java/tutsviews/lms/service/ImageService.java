package tutsviews.lms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tutsviews.lms.domain.media.Image;

@Transactional
public interface ImageService {

	Image createImage(Image image);
	
	List<Image> getAllImages();
	
	Image getOneImage(int id);
	
	boolean deleteImage(int id);
	
}
