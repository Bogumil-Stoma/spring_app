package com.example.demo1.courses;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {

    @GetMapping("/hello")
    String home(){
        return "Hello World";
    }
}
