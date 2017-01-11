package tutsviews.lms.web.rest;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import tutsviews.lms.service.AuthorService;

@Controller
public class HomeController {
    
	
	@Autowired
	AuthorService authorService;

	@Autowired
	Logger logger;

    @GetMapping("/")
    public String home(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
    	return "index";
} 
    

    
    @GetMapping("/welcome/")
    public String welcome() {
    	return "welcome";
} 
	
	
    
//    @RequestMapping("/")
//    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
//        model.addAttribute("name", name);
//        return "index";
//} 
	
	
    
}