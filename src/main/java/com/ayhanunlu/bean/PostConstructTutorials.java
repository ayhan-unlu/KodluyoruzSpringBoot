package com.ayhanunlu.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {

/*
    @Autowired
    Logger LOG;
*/


//    No Args Constructor
    //because  "this.LOG" is null
/*
    public PostConstructTutorials() {
        LOG.info("Log info is called");
    }
*/
    // Bean not yet started, gives null pointer exception we receive null
    // dependency cant be injected(meaning autowired)
    // Duty of the PostConstruct annotation : When a bean object is created it s created just after.

/*
    @PostConstruct
    public void init(){
        LOG.info("Log info is called");
    }
*/

/*
    public static void main(String[] args) {
//        System.out.println("1");
        PostConstructTutorials beanController = new PostConstructTutorials();
//        System.out.println("2");
        System.out.println(beanController);
    }
*/
}