package tutsviews.lms.web.controller.data.validators;

import org.springframework.validation.Errors; 
import org.springframework.validation.Validator;

import tutsviews.lms.domain.course.Course;

public class CourseValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Course.class.equals(clazz);
	}
	
	@Override
	public void validate(Object object, Errors error) {
		
		Course course = (Course) object;
		if (course.getDescription().length()<3) {
			error.rejectValue("description", "course.description",  "Description trop courte.");;
		}
		
		
		
	
	}

	
}
