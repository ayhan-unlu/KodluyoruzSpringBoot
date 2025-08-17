package com.ayhanunlu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
//    @ResponseBody
    public String getThymeleaf1(){
//        return "Hello Is It Me You're Looking For";
        return "thymeleaf1TemplatePage";
    }


    //http://localhost:8080/thymeleaf2
    @GetMapping("thymeleaf2")
    public String getThymeleaf2Model(Model model){
        model.addAttribute("key_model1","value_model **  1- I come from the Model **");
        model.addAttribute("key_model2","value_model **  2- I come from the Model **");
        return "thymeleaf1TemplatePage";
    }

    //http://localhost:8080/thymeleaf3
    @GetMapping("thymeleaf3")
    public String getThymeleaf3Model(Model model){
        model.addAttribute("key_model1","value_model ** First value from Model created with thymeleaf3");
        model.addAttribute("key_model2","value_model ** Second value from Model created with thymeleaf3");
        return "thymeleaf_folder/thymeleaf3TemplatePage";
    }

}
