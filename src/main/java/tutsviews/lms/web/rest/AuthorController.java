package tutsviews.lms.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.service.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	AuthorService authorService;

	@Autowired
	Logger logger;

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Author> getOne() {
		logger.info("Author list size is " + authorService.getAllAuthors().size());
		return authorService.getAllAuthors();
	}

}
