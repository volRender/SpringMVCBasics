package com.litvishko.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String showAskDetailsView(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-details-view";
    }

    //showDetails with HttpServletRequest
//    @RequestMapping("/showDetails")
//    public String showDetailsView(HttpServletRequest request, Model model) {
//
//        String empDetail = request.getParameter("employeeName");
//        empDetail = "Mr " + empDetail;
//        model.addAttribute("empAttribute", empDetail);
//
//        return "show-details-view";
//    }

    //showDetails with @RequestParam
//    @RequestMapping("/showDetails")
//    public String showDetailsView(@RequestParam("employeeName") String empDetail, Model model) {
//        empDetail = "Mr " + empDetail + "!";
//        model.addAttribute("empAttribute", empDetail);
//
//        return "show-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showDetailsView(@ModelAttribute Employee emp) {
        return "show-details-view";
    }

}
