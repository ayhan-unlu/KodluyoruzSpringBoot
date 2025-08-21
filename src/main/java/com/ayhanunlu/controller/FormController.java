package com.ayhanunlu.controller;

import com.ayhanunlu.dto.TeacherDto;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
public class FormController {

    /// /////////////////////////////////
    //FORM
    /*
    @GetMapping
    @PostMapping
    @PutMapping
    @DeleteMapping
*/
    //GetMethod
    //http://localhost:8080/form
    @GetMapping("/form")
    public String getForm(Model model){
        model.addAttribute("key_teacher1",new TeacherDto());
        return "form_post/formvalidation";
    }

    //PostMethod
    //http://localhost:8080/form
    @PostMapping("/form")
    public String postForm(@Valid @ModelAttribute("key_teacher1") TeacherDto teacherDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("From post form There is an Error");
            System.err.println("An error has occured from postForm");
            return "form_post/formvalidation";
        }
        log.info("Successfully post form"+teacherDto);
        //Add to Database (JDBC)
        //To write to a file (IO, filewriter)
        return "form_post/success";
    }

}
