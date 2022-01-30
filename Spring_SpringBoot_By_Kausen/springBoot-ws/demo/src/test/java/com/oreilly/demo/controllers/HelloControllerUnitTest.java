package com.oreilly.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloControllerUnitTest {
    @Test
    public void sayHello(){
        HelloController helloController = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = helloController.sayHello("World", model);
        assertAll(
                () -> assertEquals("World", model.asMap().get("user")),
                () -> assertEquals("hello", result)
        );
    }
}
