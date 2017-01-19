package tutsviews.lms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tutsviews.lms.domain.media.Image;
import tutsviews.lms.service.ImageService;

@Controller
public class ImageController {

	@Autowired
	ImageService imageService;
	
	@ModelAttribute
	public List<Image> getImages(){
		return imageService.getAllImages();
	}
	
	@ModelAttribute
	public Image getImage(){
		return new Image();
	}
	
	
	
	@GetMapping("/images")
	public String getAllImages(Model model){
		model.addAttribute("mode", "MODE_IMAGES");
		return "images";
	}
	
	
	@GetMapping("/images/add")
	public String addImage(Model model, @ModelAttribute Image image){
		model.addAttribute("mode", "MODE_NEW_IMAGE");
		return"images";
	}
	
	
	@PostMapping("/images/save")
	public String saveImage(@ModelAttribute Image image, Model model){
		model.addAttribute("mode", "MODE_NEW_IMAGE");
		imageService.saveImage(image);
		return "redirect:/images";
	}
	
	
	@GetMapping("images/update")
	public String updateImage(@RequestParam int id,Model model){
		model.addAttribute("mode", "MODE_UPDATE_IMAGE");
		Image image = imageService.getOneImage(id);
		model.addAttribute("image", image);
		return"images";
	}
	
	
	@GetMapping()
	public String deleteImage(@RequestParam int id, Model model){
		model.addAttribute("mode", "MODE_IMAGES");
		imageService.deleteImage(id);
		return"images";
	}
	
}
