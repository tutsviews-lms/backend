package tutsviews.lms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tutsviews.lms.domain.media.Image;
import tutsviews.lms.service.ImageService;

@Controller
public class ImageController {

	@Autowired
	ImageService imageService;
	
	@GetMapping("/images")
	public String getAllImages(Model model){
		List<Image> images = imageService.getAllImages();
		model.addAttribute("images", images);
		model.addAttribute("mode", "MODE_IMAGES");
		return "images";
	}
	
	
	@GetMapping("/images/add")
	public String addImage(){
		
		return"";
	}
	
	
	@PostMapping("/images/save")
	public String saveImage(@ModelAttribute Image image){
		imageService.saveImage(image);
		return "redirect:/images";
	}
	
}
