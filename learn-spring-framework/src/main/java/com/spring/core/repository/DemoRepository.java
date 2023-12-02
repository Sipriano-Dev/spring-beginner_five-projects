package com.spring.core.repository;

import org.springframework.stereotype.Repository;

@Repository//Derived from @component but more specific
public class DemoRepository {

    public String hello(){
        return "Hello Repository";
    }

}
