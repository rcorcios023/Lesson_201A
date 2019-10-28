package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JavaController {

    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "mainformtemplate";
    }
    @RequestMapping("/processform")
    public String loadFormPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval", login);
        return "confirmationform";

    }
}
