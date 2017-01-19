package tutsviews.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tutsviews.lms.domain.media.Image;
import tutsviews.lms.repository.ImageRepository;
import tutsviews.lms.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService {

	
	@Autowired
	ImageRepository imageRepository;
	
	
	@Override
	public void saveImage(Image image) {
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
	public void deleteImage(int id) {
		imageRepository.delete((long) id);
	}

	
	
}
