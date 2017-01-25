package tutsviews.lms;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * la classe AbstractTest est la calsse parent de toutes les classes JUnit test.
 * cette classe configure le test ApplicationContext et le test runner
 * environment.
 *
 * @author Alaeddine Zaier
 */

@SqlGroup({
    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:beforeTestRun.sql")
    ,
    @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:afterTestRun.sql")
})

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles={"test"})
@WebAppConfiguration
@ContextConfiguration
public abstract class AbstractTest {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

}