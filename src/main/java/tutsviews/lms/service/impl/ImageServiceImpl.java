package tutsviews.lms.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tutsviews.lms.domain.media.Image;
import tutsviews.lms.repository.ImageRepository;
import tutsviews.lms.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService {

	
	@Autowired
	ImageRepository imageRepository;
	
	@Autowired
	Logger logger;
	
	
	@Override
	public void createImage(Image image) {
		imageRepository.save(image); 
	}

	@Override
	public List<Image> getAllImages() {
		return imageRepository.findAll();
	}

	@Override
	public Image getOneImage(int id) {
		return imageRepository.getOne((long) id);
	}

	@Override
	public boolean deleteImage(int id) {
		if (!(imageRepository.findOne((long) id)==null)) {
			imageRepository.delete((long) id);
			logger.info("image with id "+id +" have been deleted.");
			return true;
		}else {
			logger.error("cannot delete image with id "+id);
			return false;
		}
	}

	
	
}
