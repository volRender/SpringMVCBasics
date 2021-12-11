package com.litvishko.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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
    public String showDetailsView(HttpServletRequest request, Model model) {

        String empDetail = request.getParameter("employeeName");
        empDetail = "Mr " + empDetail;
        model.addAttribute("empAttribute", empDetail);

        return "show-details-view";
    }

}
