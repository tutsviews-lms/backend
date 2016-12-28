package tutsviews.lms;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * la classe AbstractTest est la calsse parent de toutes les classes JUnit test.
 * cette classe configure le test ApplicationContext et le test runner
 * environment.
 *
 * @author Alaeddine Zaier
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public abstract class AbstractTest {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

}