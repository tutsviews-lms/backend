package tutsviews.lms.repository;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.author.Author;
import tutsviews.lms.domain.course.Category;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@SqlGroup({
    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:beforeTestRun.sql")
    ,
    @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:afterTestRun.sql")
})

public class CategoryRepositoryTest extends AbstractTest {

	
	@Autowired
	CategoryRepository categoryRepository;
	
	
	@Test 
	public void search_NoCategoryEntriesFound_ShouldReturnEmptyList(){
		List<Category> categories = categoryRepository.query("Not Found");
		assertThat(categories.size(), is(0));
	}
	
	
	@Test
	public void search_OneCategoryEntryFound_ShouldReturnAListOfOneEntry() {
		List<Category> categories = categoryRepository.query("Musi");
		assertThat(categories.size(), is(1));
		assertThat(categories.get(0), allOf(hasProperty("id", is(4L)), hasProperty("nameCategory", is("Musique"))));

	}
	
}
