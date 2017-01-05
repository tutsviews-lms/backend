package tutsviews.lms.repository;


import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.author.Author;

@SqlGroup({
    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:beforeTestRun.sql")
    ,
    @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:afterTestRun.sql")
})


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
	
}
