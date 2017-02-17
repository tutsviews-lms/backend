package tutsviews.lms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ALadin Zaier PC IBS on 17/02/2017.
 */

@Controller
public class LoginController {

    private static final String LOGIN_VIEW_NAME="/login";

    @GetMapping("/login")
    public String getLoginPage(){
        return LOGIN_VIEW_NAME;
    }
}
