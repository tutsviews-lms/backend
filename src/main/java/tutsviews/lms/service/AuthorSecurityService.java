package tutsviews.lms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.repository.AuthorRepository;

/**
 * Created by ALadin Zaier PC IBS on 17/02/2017.
 */
@Service
public class AuthorSecurityService implements UserDetailsService {

    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(AuthorSecurityService.class);

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Author author = authorRepository.getAuthorByEmail(email);

        if (author==null) {
        LOG.info("User with email {} is not found.",email);
        }

        return author;
    }
}
