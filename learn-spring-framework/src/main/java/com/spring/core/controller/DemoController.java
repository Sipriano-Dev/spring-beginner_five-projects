package com.spring.core.controller;

import org.springframework.stereotype.Controller;

@Controller //Derived from @component but more specific
public class DemoController {

    public String hello() {
        return "Hello Controller";
    }

}
