package io.github.junrdev.minipos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductsApiController {

    @GetMapping("/")
    public String sayHiII(){
        return "Products Api";
    }

}