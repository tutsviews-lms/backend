package tutsviews.lms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import tutsviews.lms.service.AuthorService;
import tutsviews.lms.service.RoleService;


@SpringBootApplication
public class Application extends SpringBootServletInitializer implements CommandLineRunner {

    @Autowired
    AuthorService authorService;

    @Autowired
    RoleService roleService;


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Value("${application.name}")
    private String applicationName;


    @Override
    public void run(String... arg0) throws Exception {
        log.info("Application name :{}", applicationName);

        String email = "aladin@basicuser.fr";

        if (!authorService.existAuthorWithUserNameOrEmail(email)) {

//            Author basicAuthor = AuthorUtils.createBasicAuthor();
//            basicAuthor.setEmail(email);
//
//            Role role = new Role(RoleType.BASIC);
//            roleService.save(role);
//
//            List<Role> roles = new ArrayList<>();
//            roles.add(role);
//
//            basicAuthor.setRoles(roles);
//
//            log.info("Creating user with value {} as username", basicAuthor.getUsername());
//            authorService.createAuthor(basicAuthor);
//            log.info("User with value {} as username created", basicAuthor.getUsername());

        }

    }


}
