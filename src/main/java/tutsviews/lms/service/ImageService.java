package tutsviews.lms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tutsviews.lms.domain.media.Image;

@Transactional
public interface ImageService {

	public void saveImage(Image image);
	
	public List<Image> getAllImages();
	
	public Image getOneImage(int id);
	
	public void deleteImage(int id);
	
}
