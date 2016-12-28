//package tutsviews.lms.config;
//
//import java.util.List;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.xebia.jacksonlombok.JacksonLombokAnnotationIntrospector;
//
//@Configuration
//@EnableWebMvc
//public class WebConfig extends WebMvcConfigurerAdapter {
//    
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        final ObjectMapper objectMapper = new ObjectMapper()
//                .setAnnotationIntrospector(new JacksonLombokAnnotationIntrospector());
//
//        converters.add(new MappingJackson2HttpMessageConverter(objectMapper));
//
//        super.configureMessageConverters(converters);
//    }
//    
//    
//}