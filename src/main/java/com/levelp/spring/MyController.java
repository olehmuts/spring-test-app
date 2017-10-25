package com.levelp.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "my")
public class MyController {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "index";
    }
}
