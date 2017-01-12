package tutsviews.lms.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	
	@Autowired 
	CourseService courseService;
	
	@Autowired
	Logger logger;
	 
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAll(){
	return "les cours";
	}

}
