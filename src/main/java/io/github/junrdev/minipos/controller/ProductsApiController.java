package io.github.junrdev.minipos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/products")
class ProductApiController extends ApiController{

    @GetMapping("/")
    public String sayHiII(){
        return "Products Api";
    }

}