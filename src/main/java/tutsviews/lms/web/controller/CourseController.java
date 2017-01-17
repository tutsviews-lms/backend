package tutsviews.lms.web.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tutsviews.lms.domain.course.Course;
import tutsviews.lms.service.CourseService;

@Controller
public class CourseController {
	
	
	@Autowired 
	CourseService courseService;
	
	
	@Autowired
	Logger logger;
	
	
	@GetMapping("/courses")
	
	public String getAllCourses(Model model){
		model.addAttribute("mode", "MODE_COURSES");
		model.addAttribute("courses",courseService.getAllCourses());
	return "courses";
	}

	
	@GetMapping("/courses/add")
	public String addCourse(Model model, @ModelAttribute Course course ){
		model.addAttribute("mode", "MODE_NEW_COURSE");
	return "courses";
	}
	
	
	
	@PostMapping("/courses/save")
	public String saveCourse(@ModelAttribute Course course) {
		courseService.saveCourse(course);
		return "redirect:/courses";
	}
	
	
	
	@GetMapping("/courses/delete")
	public String deleteCourse(@RequestParam int id, Model model){
		model.addAttribute("mode", "MODE_COURSES");
		courseService.deleteCourse(id);
		return "courses";
	}
	
	
	@GetMapping("/courses/update")
	public String updateCourse(@RequestParam int id, Model model, @ModelAttribute Course course){
		model.addAttribute("mode", "MODE_COURSES");
		courseService.saveCourse(course);
		return "courses";
	}
	
}
