package tutsviews.lms.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by ALadin Zaier PC IBS on 17/02/2017.
 */
@Configuration
@EnableJpaRepositories(basePackages = "tutsviews.lms.repository")
@EntityScan(basePackages = "tutsviews.lms.domain")
@EnableTransactionManagement
public class ApplicationConfig {
}
