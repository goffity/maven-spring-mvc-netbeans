package com.goffity.test.maven.spring.mvc.controller;

import com.goffity.test.maven.spring.mvc.form.LoginForm;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author goffity
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/showlogin")
    public ModelAndView showloginPage() {
        return new ModelAndView("login", "command", new LoginForm());
    }

//    @RequestMapping(value = "/login")
//    public String login(@ModelAttribute("loginForm") LoginForm loginForm, BindingResult result) {
//
//        System.out.println("Username: " + loginForm.getUsername() + " Password: " + loginForm.getPassword());
//        String ret;
//
//        if (loginForm.getUsername().equals("admin") && loginForm.getPassword().equals("admin")) {
//            ret = "redirect:login_success.do";
//        } else {
//            ret = "redirect:login_error.do";
//        }
//
//        return ret;
//    }
    @RequestMapping(value = "/login")
    public ModelAndView login(@RequestParam String username, String password, HttpSession httpSession) {
        System.out.println("Username: " + username + " Password: " + password);

        if ((username != null && username.equals("admin")) && (password != null && password.equals("password"))) {
            httpSession.setAttribute("login", "success");
        } else {
            httpSession.setAttribute("login", "login_error");
        }
        return new ModelAndView("login_success");
    }

    @RequestMapping("/login_success")
    public ModelAndView loginSuccess() {
        return new ModelAndView("login_success");
    }

    @RequestMapping("/login_error")
    public ModelAndView loginError() {
        return new ModelAndView("login_error");
    }
}
