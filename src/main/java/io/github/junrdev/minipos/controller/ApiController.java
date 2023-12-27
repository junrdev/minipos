package io.github.junrdev.minipos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/minipos/api")
public class ApiController {

    @GetMapping("/")
    public String sayHi(){
        return "Hello World";
    }

}



