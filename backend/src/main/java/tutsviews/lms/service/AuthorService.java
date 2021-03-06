package tutsviews.lms.service;

import java.util.List;

import tutsviews.lms.domain.author.Author;

public interface AuthorService {

	List<Author> getAllAuthors();
	
	Author getOneAuthor(int id);
	
	void deleteAuthor(int id);
	
	void saveAuthor(Author author);
	
	
	
}
