package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String index() {
        return "index";
    }
}
//Renders the home page
//Returns index - a thymeleaf template - which has a heading and a link

