package tutsviews.lms.web.controller;

import java.util.Date; 
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.service.AuthorService;
import tutsviews.lms.web.controller.data.validators.AuthorValidator;

@Controller
@SessionAttributes("author")
public class AuthorController {

	@Autowired
	AuthorService authorService;

	@Autowired
	Logger logger;

	
	@ModelAttribute("author")
	public Author getAuthor(){
		return new Author();
	}
	
	@ModelAttribute("authors")
	public List<Author> getAuthors(){
		return authorService.getAllAuthors();
	}
	

	
	@GetMapping("/authors")
	public String allAuthors(Model model) {
		model.addAttribute("mode", "MODE_AUTHORS");
    	return "authors";
	}
	
	@GetMapping("/authors/add")	
	public String addAuthor(Model model) {
		model.addAttribute("mode", "MODE_NEW_AUTHOR");
    	return "authors";
	}
	
	@PostMapping("/authors/save")
	public String saveAuthor (@Valid @ModelAttribute Author author,BindingResult result ,
			HttpServletRequest request, SessionStatus status) {
	
		if (result.hasErrors()) {
			request.setAttribute("mode", "MODE_NEW_AUTHOR");
	    	return "authors";
		}
		
		author.setCreatedAt(new Date());
		authorService.saveAuthor(author);
		request.setAttribute("authors", authorService.getAllAuthors());
		request.setAttribute("mode", "MODE_AUTHORS");
		status.setComplete();
    	return "redirect:/authors";
	}
	
	
	
	
	@GetMapping("/authors/update")
	public String updateAuthor(@RequestParam int id, Model model) {
		model.addAttribute("author", authorService.getOneAuthor(id));
		model.addAttribute("mode", "MODE_UPDATE_AUTHOR");
    	return "authors";
	}

	
	@GetMapping("/authors/delete")
	public String deleteAuthor(@RequestParam int id, HttpServletRequest request) {
		authorService.deleteAuthor(id);
		request.setAttribute("mode", "MODE_AUTHORS");
    	return "redirect:/authors";
	}

	
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.addValidators(new AuthorValidator());
	}
	
	
}
