package com.example.redistest.demo.web;

import com.example.redistest.demo.anno.AccessLimit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("hello")
    public String hello(){
        return "zxc";
    }

    @GetMapping("oo")
    @AccessLimit
    public String oo(){
        return "oo";
    }
}
