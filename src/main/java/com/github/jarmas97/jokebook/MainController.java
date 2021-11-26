package com.github.jarmas97.jokebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/login-page")
    public String getSignUpPage() {
        return "login-page";
    }

    @RequestMapping("/register-page")
    public String getSignInPage() {
        return "register-page";
    }

    @RequestMapping("/about")
    public String getAbout() {
        return "about";
    }

    @RequestMapping("/contact")
    public String getContact() {
        return "contact";
    }
}
