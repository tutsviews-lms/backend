package tutsviews.lms.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {
	
	
	@Autowired
	AuthorService authorService;
	
	
	@RequestMapping(value="", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Author> getOne(){
		return authorService.getAllAuthors();
	}
	
	
	

}
