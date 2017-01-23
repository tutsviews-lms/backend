package tutsviews.lms.repository;


import static org.hamcrest.Matchers.allOf;  
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.author.Author;



public class AuthorRepositoryTest extends AbstractTest{

	
	@Autowired 
	AuthorRepository authorRepository;
	
	
	 @Test
	    public void search_NoAuthorEntriesFound_ShouldReturnEmptyList() {
	        List<Author> authors = authorRepository.getByAddressState("NOT FOUND");
	        assertThat(authors.size(), is(0));
	    }
	
	@Test
	public void search_OneAuthorEntryFound_ShouldReturnAListOfOneEntry() {
		List<Author> authors = authorRepository.getByAddressState("Tunisie");

		assertThat(authors.size(), is(1));
		assertThat(authors.get(0), allOf(hasProperty("id", is(3L)), hasProperty("firstName", is("Houssem eddine")),
				hasProperty("email", containsString("@"))));

	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void search_TwoAuthorEntriesFound_ShouldReturnAListOfTwoEntries() {
        List<Author> authors = authorRepository.getByAddressState("France");

        assertThat(authors.size(), is(2));
        assertThat(authors, contains(
                allOf(
                        hasProperty("id", is(1L)),
                        hasProperty("firstName", is("Alaeddine")),
                        hasProperty("email", startsWith("zai"))
                ),
                allOf(
                        hasProperty("id", is(2L)),
                        hasProperty("firstName", is("Houssem")),
                        hasProperty("email", endsWith("com"))
                )
        ));
    }
	
	
	
	@Test
	public void SaveAuthor_shoud_add_a_new_author(){
		
		Author newAuthor = new Author();
		newAuthor.setLastName("Zaier");
		newAuthor.setFirstName("Alaeddine");
		newAuthor.setPassword("password");
		newAuthor.setEmail("");
		newAuthor.setTel("");
		newAuthor.setCreatedAt(new Date());
        authorRepository.save(newAuthor); 
        
        assertNotNull(newAuthor.getId());
        Author reloadedAuthor = authorRepository.findOne(newAuthor.getId());
        assertEquals(newAuthor.getId(), reloadedAuthor.getId());
        assertEquals(reloadedAuthor.getLastName(), newAuthor.getLastName());
         
	}
	
}
