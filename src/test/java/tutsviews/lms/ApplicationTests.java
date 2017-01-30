package tutsviews.lms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;

import tutsviews.lms.controller.AuthorControllerTest;
import tutsviews.lms.controller.CourseControllerTest;
import tutsviews.lms.controller.HomeControllerTest;
import tutsviews.lms.controller.ImageControllerTest;
import tutsviews.lms.repository.AuthorRepositoryTest;
import tutsviews.lms.repository.CategoryRepositoryTest;
import tutsviews.lms.repository.CourseRepositoryTest;
import tutsviews.lms.repository.ImageRepositoryTest;
import tutsviews.lms.service.AuthorServiceTest;
import tutsviews.lms.service.CourseServiceTest;
import tutsviews.lms.service.ImageServiceTest;

@RunWith(Suite.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
@ActiveProfiles(profiles={"test","local-test"})
@Suite.SuiteClasses({ AuthorRepositoryTest.class, CategoryRepositoryTest.class,CourseRepositoryTest.class,
					ImageRepositoryTest.class,AuthorServiceTest.class,ImageServiceTest.class,
					CourseServiceTest.class,
					AuthorControllerTest.class,ImageControllerTest.class,CourseControllerTest.class,
					HomeControllerTest.class})
public class ApplicationTests { 
 
	@Test
	public void contextLoads() {
	}
	
}
