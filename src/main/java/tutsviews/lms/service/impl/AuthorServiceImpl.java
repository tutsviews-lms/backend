package tutsviews.lms.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.repository.AuthorRepository;
import tutsviews.lms.service.AuthorService;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService { 

	/** The application logger */
	private static final Logger LOG = LoggerFactory.getLogger(AuthorServiceImpl.class);

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
            LOG.info("User ID: " + id + " deleted Entry from Author table.");
            return true;
        } else {
            LOG.error("Error while deleting Entry with id: "+ id + " from Author table.");
            return false;
        }
		
	}

	public Author createAuthor(Author author) {
		return authorRepository.save(author);

	}

	@Override
	public Boolean existAuthorWithUserNameOrEmail(String email) {

		if (!(authorRepository.getAuthorByEmail(email) ==null)) { return true; }

		return false;
	}
}
