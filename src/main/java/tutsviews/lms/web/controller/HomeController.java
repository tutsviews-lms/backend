package tutsviews.lms.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import tutsviews.lms.service.AuthorService;

@Controller
public class HomeController {
    
	
	@Autowired
	Logger logger;

    @GetMapping("/")
    public String home(HttpServletRequest request) {
    	return "index";
} 
    


	
    
}