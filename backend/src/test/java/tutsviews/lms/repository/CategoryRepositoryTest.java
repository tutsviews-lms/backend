package tutsviews.lms.repository;

import static org.hamcrest.Matchers.allOf; 
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.course.Category;



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
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void search_TwoAuthorEntriesFound_ShouldReturnAListOfTwoEntries() {
		List<Category> categories = categoryRepository.query("Mu");
		assertThat(categories.size(), is(2));
		assertThat(categories, contains(allOf(
                        hasProperty("id", is(4L)),
                        hasProperty("nameCategory", is("Musique"))
                ),
				allOf(
                        hasProperty("id", is(5L)),
                        hasProperty("nameCategory", is("Multimédia"))
                )
				));
	
	}
	
	
}
