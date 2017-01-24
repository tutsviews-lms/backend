package tutsviews.lms.service;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.VerificationModeFactory;
import org.slf4j.Logger;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.author.Author;
import tutsviews.lms.repository.AuthorRepository;
import tutsviews.lms.service.impl.AuthorServiceImpl;

public class AuthorServiceTest extends AbstractTest {
	
	private static final int AUTHOR_ID = 1;
	
	@Mock
	private AuthorRepository authorRepository;
	
	@Mock
	private Logger logger;
	
	@InjectMocks 
	private AuthorService authorService = new AuthorServiceImpl();
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void getAllAuthors_shoud_return_all_athors(){
		
		List<Author> authors = new ArrayList<>();
		authors.add(new Author());
		authors.add(new Author());
		
		when(authorRepository.findAll()).thenReturn(authors);
	
		assertThat(authorService.getAllAuthors().size() ,is(2));
		verify(authorRepository).findAll();
	}
	
	
	@Test
	public void getOneAuthor_should_return_one_author(){
		 Author author = new Author();
		 
		 when(authorRepository.findOne(anyLong())).thenReturn(author);
		 
		 assertThat(authorService.getOneAuthor(AUTHOR_ID),is(author));
		 verify(authorRepository).findOne((long) AUTHOR_ID);
		
	}

	
	@Test
	public void createAuthor_shoud_add_a_new_author(){
		
		// Expected objects
        Author authorToSave = new Author();
        Author persistedAuthor = new Author();
        persistedAuthor.setId((long) AUTHOR_ID);
		
        // Mockito expectations                            
        when(authorRepository.save(any(Author.class))).thenReturn(persistedAuthor);
         
        // Execute the method being tested     
        Author newAuthor = authorService.createAuthor(authorToSave);;

        // Validation  
        assertNotNull(newAuthor);
        assertEquals(persistedAuthor.getId(), newAuthor.getId());
        verify(authorRepository, VerificationModeFactory.times(1)).save(authorToSave);
	} 
	
	@Test
	public void deleteAuthor_should_call_delete_from_repository(){

		// Mockito expectations
        doNothing().when(authorRepository).delete(anyLong());
        when(authorRepository.findOne(anyLong())).thenReturn(new Author());
        
        // Execute the method being tested
        assertEquals(authorService.deleteAuthor(AUTHOR_ID), true);
        verify(authorRepository,VerificationModeFactory.times(1)).delete((long) AUTHOR_ID);
	}   
	
	
	
	@Test
	public void delete_non_existing_Author_should_return_false(){
		
		when(authorRepository.findOne(anyLong())).thenReturn(null);		
		assertFalse(authorService.deleteAuthor(AUTHOR_ID));
		
	}

}
