/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goffity.test.maven.spring.mvc.controller;

import com.goffity.test.maven.spring.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author goffity
 */
@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public ModelAndView hello() {
        User user = new User("Gof", "Hello");
        return new ModelAndView("hello", "user", user);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    public ModelAndView hi() {
        User user = new User("Por", "Hi");
        return new ModelAndView("hello", "user", user);
    }
}
