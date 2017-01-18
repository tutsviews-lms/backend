package tutsviews.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.repository.AuthorRepository;
import tutsviews.lms.service.AuthorService;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorRepository authorRepository;

	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}

	public Author getOneAuthor(int id) {
		return authorRepository.findOne((long) id);
	}

	public void deleteAuthor(int id) {
		authorRepository.delete((long) id);
	}

	public void saveAuthor(Author author) {
		authorRepository.save(author);

	}
}
