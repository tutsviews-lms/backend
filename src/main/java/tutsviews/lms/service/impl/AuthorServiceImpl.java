package tutsviews.lms.service.impl;

import java.util.List;

import org.slf4j.Logger;
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
	Logger logger;

	@Autowired
	AuthorRepository authorRepository;

	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}

	public Author getOneAuthor(int id) {
		return authorRepository.findOne((long) id);
	}

	public boolean deleteAuthor(int id) { 
		
        if (authorRepository.findOne((long) id) != null) {
            authorRepository.delete((long) id);
            logger.info("User ID: " + id + " deleted Entry from Author table.");
            return true;
        } else {
            logger.error("Error while deleting Entry with id: "+ id + " from Author table.");
            return false;
        }
		
	}

	public Author createAuthor(Author author) {
		return authorRepository.save(author);

	}
}
