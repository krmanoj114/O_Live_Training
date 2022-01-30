package com.oreilly.demo.controllers;


import com.oreilly.demo.entities.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/rest")
    public Greeting greet(@RequestParam(value = "name", required = false,
            defaultValue = "World") String name){
            return new Greeting("Hello " +name);

    }
}
