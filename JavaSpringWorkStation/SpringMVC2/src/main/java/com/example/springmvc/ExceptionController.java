package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController{
    @RequestMapping("/exception")
    public String mypage(@ModelAttribute("student") Student student, Model model) {
        int a= 10;
        int b= 0;
        int c= a/ b;

        model.addAttribute(student);
        return "mypage";
    }
}
