package com.rana.sprintbootrest.course.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHelloMan(){
        return "Hello RaNa";
    }
}
