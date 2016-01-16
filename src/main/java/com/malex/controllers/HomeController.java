package com.malex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    private final String INDEX_PAGE = "index";

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return INDEX_PAGE;
    }


}
