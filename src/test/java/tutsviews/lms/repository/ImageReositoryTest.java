package tutsviews.lms.repository;

import static com.ninja_squad.dbsetup.Operations.sequenceOf;

import javax.print.attribute.standard.Destination;

import org.h2.jdbcx.JdbcConnectionPool;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.destination.DataSourceDestination;
import com.ninja_squad.dbsetup.operation.Operation;

import tutsviews.lms.Application;
import tutsviews.lms.CommonOperations;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
@ActiveProfiles(profiles={"test","local-test"})
public class ImageReositoryTest {
	

	private static JdbcConnectionPool dataSource;
	 

@Autowired
private JdbcTemplate jdbcTemplate;
 
@Autowired
private Destination destination;
	
//	    @Before
//	    public void prepare() throws Exception {
//	    	
//	        dataSource = JdbcConnectionPool.create("jdbc:h2:mem:mydb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE", "sa", "");
//
//	    	
//	        Operation operation =
//	            sequenceOf(
//	                CommonOperations.DELETE_ALL
////	                CommonOperations.INSERT_REFERENCE_DATA
//	                )
//	            ;
//	    
//	        DbSetup dbSetup = new DbSetup(new DataSourceDestination(dataSource), operation);
//	        dbSetup.launch();
//	    }
	    
	    
	    @Test
	    public void testFindByCode() {
	    	
	    }
	}