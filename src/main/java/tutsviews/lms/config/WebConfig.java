package tutsviews.lms.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("tutsviews.lms")
public class WebConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {

	
	  private ApplicationContext applicationContext;


	    public WebConfig() {
	        super();
	    }
	    
	    
	    
	@Override
	  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
	
	
	
	
	 @Bean
	    @Scope("prototype")
	    public Logger logger(InjectionPoint injectionPoint) {
	        return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass());
	    }
	
	
	
	
}
