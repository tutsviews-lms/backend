package tutsviews.lms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tutsviews.lms.domain.author.Author;

@Transactional
public interface AuthorService {

	List<Author> getAllAuthors();
	
	Author getOneAuthor(int id);
	
	void deleteAuthor(int id);
	
	Author saveAuthor(Author author);
	
	
	
}
