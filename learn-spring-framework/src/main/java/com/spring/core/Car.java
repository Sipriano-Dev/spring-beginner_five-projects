package com.spring.core;

import org.springframework.stereotype.Component;

@Component()
//@Component("car") if you don't specify a name, spring IOC will create like this
public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car is moving..");
    }
}
