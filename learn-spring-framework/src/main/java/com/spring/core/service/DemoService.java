package com.spring.core.service;

import org.springframework.stereotype.Service;

@Service//Derived from @component but more specific
public class DemoService {

    public String hello() {
        return "Hello Service";
    }

}
