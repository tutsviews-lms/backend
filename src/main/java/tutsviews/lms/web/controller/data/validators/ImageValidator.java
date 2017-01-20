package tutsviews.lms.web.controller.data.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import tutsviews.lms.domain.media.Image;

public class ImageValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Image.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		System.out.println(errors.getFieldErrorCount());
	}

}
