package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary //that will give preference to this bean when there is more than one of the same type(interface use)
public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car is moving..");
    }
}
