package tutsviews.lms;

import org.junit.Test; 
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;

import tutsviews.lms.repository.AuthorRepositoryTest;
import tutsviews.lms.repository.CategoryRepositoryTest;
import tutsviews.lms.repository.CourseRepositoryTest;

@RunWith(Suite.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
@ActiveProfiles(profiles={"test","local-test"})
@Suite.SuiteClasses({ AuthorRepositoryTest.class, CategoryRepositoryTest.class,CourseRepositoryTest.class})
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

	
}
