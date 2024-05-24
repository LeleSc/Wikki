package com.lelettie.wikki.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController would return a string.
 * For a project with a frontend-backend separation, we return a string, so we use @RestController.
 * Alternatively, we can use @Controller to return a page.
 */
@RestController

public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post, " + name;
    }
}
