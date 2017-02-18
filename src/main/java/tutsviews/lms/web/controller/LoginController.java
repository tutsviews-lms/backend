package tutsviews.lms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ALadin Zaier PC IBS on 17/02/2017.
 */

@Controller
public class LoginController {

    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);

    private static final String LOGIN_VIEW_NAME="/login";

    @GetMapping("/login")
    public String getLoginPage(){
        LOG.info("Login controller called");
        return LOGIN_VIEW_NAME;
    }
}
