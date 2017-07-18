package com.test.thymeleaftest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JL on 18/07/2017.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndexPage() {
        return "index";
    }

    @RequestMapping("/use-case")
    public String showUseCasePage() {
        return "use-case";
    }

    @RequestMapping("/support")
    public String showSupportPage() {
        return "support";
    }
}
