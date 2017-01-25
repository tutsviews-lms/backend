package tutsviews.lms.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tutsviews.lms.domain.media.Image;
import tutsviews.lms.service.ImageService;
import tutsviews.lms.web.controller.data.validators.ImageValidator;

@Controller
public class ImageController {

	@Autowired
	ImageService imageService;
	
	@ModelAttribute("images")
	public List<Image> getImages(){
		List<Image> images = imageService.getAllImages();
		return images;
	}
	 
	@ModelAttribute("image")
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
	public String saveImage(@Valid  @ModelAttribute Image image ,BindingResult bindingResult , Model model){
		if (bindingResult.hasErrors()) {
			model.addAttribute("mode", "MODE_NEW_IMAGE");
			return"images";
		}
		model.addAttribute("mode", "MODE_NEW_IMAGE");
		imageService.createImage(image);
		return "redirect:/images";
	}
	
	
	@GetMapping("images/update")
	public String updateImage(@RequestParam int id,Model model){
		model.addAttribute("mode", "MODE_UPDATE_IMAGE");
		Image image = imageService.getOneImage(id);
		model.addAttribute("image", image);
		return"images";
	}
	
	
	@GetMapping("/images/delete")
	public String deleteImage(@RequestParam int id, Model model){
		imageService.deleteImage(id);
		model.addAttribute("mode", "MODE_IMAGES");
		List<Image> images =getImages();
		model.addAttribute("iamges", images);
		return"redirect:/images";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		webDataBinder.addValidators(new ImageValidator());
	}
}
