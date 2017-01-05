package tutsviews.lms.repository;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.author.Author;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

@SqlGroup({
    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:beforeTestRun.sql")
    ,
    @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:afterTestRun.sql")
})


public class AuthorRepositoryTest extends AbstractTest{

	
	@Autowired 
	AuthorRepository authorRepository;
	
	
	@Test
	public void findByState(){
		
		List<Author> authors = authorRepository.getByAddressState("France");
		 assertThat(authors.size(), is(2));
		 assertThat(authors.size(), is(2));
		
	}
	
}
