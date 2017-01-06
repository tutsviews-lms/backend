package tutsviews.lms.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tutsviews.lms.Application;
import tutsviews.lms.domain.author.Author;
import tutsviews.lms.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	
	@Autowired
	AuthorService authorService;
	
	
	@RequestMapping(value="", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Author> getOne(){
		log.error("Author list is "+authorService.getAllAuthors().size());
		return authorService.getAllAuthors();
	}
	
	
	

}
