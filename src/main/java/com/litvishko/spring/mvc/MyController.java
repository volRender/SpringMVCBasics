package com.litvishko.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String showAskDetailsView() {
        return "ask-details-view";
    }

    @RequestMapping("/showDetails")
    public String showDetailsView() {
        return "show-details-view";
    }

}
