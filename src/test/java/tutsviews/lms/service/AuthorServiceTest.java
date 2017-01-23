package tutsviews.lms.service;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.author.Author;
import tutsviews.lms.repository.AuthorRepository;
import tutsviews.lms.service.impl.AuthorServiceImpl;

public class AuthorServiceTest extends AbstractTest {
	
	private static final int AUTHOR_ID = 1;
	
	@Mock
	private AuthorRepository authorRepository;
	
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
	public void saveAuthor_shoud_add_an_author(){
		
		
	}

}
