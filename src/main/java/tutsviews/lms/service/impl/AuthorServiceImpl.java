package tutsviews.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.repository.AuthorRepository;
import tutsviews.lms.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

	
	@Autowired
	AuthorRepository authorRepository;
	
	public List<Author> getAllAuthors() {
		
		return authorRepository.findAll();
	}

	
	public Author getOne(int id) {
		
		return authorRepository.findOne((long) id);
	}

}
