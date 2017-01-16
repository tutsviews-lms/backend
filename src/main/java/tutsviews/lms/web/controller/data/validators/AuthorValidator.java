package tutsviews.lms.web.controller.data.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import tutsviews.lms.domain.author.Author;

@Component
public class AuthorValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Author.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors error) {
		Author author=(Author)object;
		System.out.println(author.getPassword());
		int a = author.getPassword().length();
		if (author.getPassword().length()<3) {
			System.out.println(a);
			error.rejectValue("password", "author.password", "Le mot de passe saisi est trop court");
			System.out.println(a);
		}else {
			System.out.println(a);
		}
	}
	
	
	

}
