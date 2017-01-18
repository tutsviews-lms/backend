package tutsviews.lms.web.controller;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

import tutsviews.lms.domain.course.Course;
import tutsviews.lms.service.CourseService;
import tutsviews.lms.web.controller.data.validators.CourseValidator;

@Controller
@SessionAttributes("course")
public class CourseController {
	
	
	@Autowired 
	CourseService courseService;
		
	@Autowired
	Logger logger;
	
	@ModelAttribute("difficultyOptions")
	public List<String> getOptions(){
		List<String> DifficutyCheks = new LinkedList<>(Arrays.asList(new String[]{"HARD","MEDIUM","EASY"}));
		return DifficutyCheks;
	}
	
	@ModelAttribute("course")
	public Course getCourse(){
		return new Course();
	}
	
	@ModelAttribute("courses")
	public List<Course> getCourses(){
		return courseService.getAllCourses();
	}
	
	@GetMapping("/courses")
	public String getAllCourses(Model model){
		model.addAttribute("mode", "MODE_COURSES");
	return "courses";
	}

	
	@GetMapping("/courses/add")
	public String addCourse(Model model){
		model.addAttribute("mode", "MODE_NEW_COURSE");
		List<String> DifficutyCheks = new LinkedList<>(Arrays.asList(new String[]{"HARD","MEDIUM","EASY"}));
		model.addAttribute("difficultyOptions",DifficutyCheks);
	return "courses";
	}
	
	
	
	@PostMapping("/courses/save")
	public String saveCourse(@Valid  @ModelAttribute Course course, BindingResult result, SessionStatus status,Model model) {
		if (result.hasErrors()) {
			model.addAttribute("mode", "MODE_NEW_COURSE");
			return("courses");
		}
		courseService.saveCourse(course);
		status.setComplete();
		return "redirect:/courses";
	}
	
	
	
	@GetMapping("/courses/delete")
	public String deleteCourse(@RequestParam int id, Model model){
		model.addAttribute("mode", "MODE_COURSES");
		courseService.deleteCourse(id);
		return "redirect:/courses";
	}
	
	
	@GetMapping("/courses/update")
	public String updateCourse(@RequestParam int id, Model model,SessionStatus status){
		model.addAttribute("mode", "MODE_NEW_COURSE");
		model.addAttribute("course", courseService.getOneCourse(id));
		status.setComplete();
		return "courses";
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.addValidators(new CourseValidator());
	}
}
