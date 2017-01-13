package tutsviews.lms.web.rest;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import scala.annotation.meta.setter;
import tutsviews.lms.domain.author.Address;
import tutsviews.lms.domain.author.Author;
import tutsviews.lms.service.AuthorService;

@Controller
public class AuthorController {

	@Autowired
	AuthorService authorService;

	@Autowired
	Logger logger;

//	@GetMapping("/authors")
//	public String allAuthors(HttpServletRequest request) {
//		logger.info("Author list size is " + authorService.getAllAuthors().size());
//		request.setAttribute("authors", authorService.getAllAuthors());
//		request.setAttribute("mode", "MODE_AUTHORS");
//    	return "index";
//	}
	
	
	@GetMapping("/authors")
	public String allAuthorsWithModel(Model model) {
		logger.info("Author list size is " + authorService.getAllAuthors().size());
		model.addAttribute("authors", authorService.getAllAuthors());
		model.addAttribute("mode", "MODE_AUTHORS");
    	return "index";
	}
	
	@GetMapping("/authors/add")	public String addAuthor(Model model) {
		model.addAttribute("mode", "MODE_NEW_AUTHOR");
		model.addAttribute("author", new Author());
    	return "index";
	}
	
	@PostMapping("/authors/save")
	public String saveAuthor(@ModelAttribute Author author,
			HttpServletRequest request) {
		System.out.println(author);
		author.setCreatedAt(new Date());
		authorService.saveAuthor(author);
		request.setAttribute("authors", authorService.getAllAuthors());
		request.setAttribute("mode", "MODE_AUTHORS");
    	return "index";
	}
	
	
	@GetMapping("/authors/update")
	public String updateAuthor(@RequestParam int id, HttpServletRequest request) {
		request.setAttribute("author", authorService.getOnAuthor(id));
		request.setAttribute("mode", "MODE_UPDATE_AUTHOR");
    	return "index";
	}

	
	@GetMapping("/authors/delete")
	public String deleteAuthor(@RequestParam int id, HttpServletRequest request) {
		authorService.deleteAuthor(id);
		request.setAttribute("authors", authorService.getAllAuthors());
		request.setAttribute("mode", "MODE_AUTHORS");
    	return "index";
	}

}
