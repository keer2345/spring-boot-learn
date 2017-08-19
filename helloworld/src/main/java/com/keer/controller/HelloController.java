package com.keer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by qinjh on 17-8-19.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello1")
    public String hello1() {
        return "Hello world.";
    }

    @RequestMapping("/hello2")
    public List<String> hello2() {
        return Arrays.asList(new String[]{"A", "B", "C"});
    }
}
