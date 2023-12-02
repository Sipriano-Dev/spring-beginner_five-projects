package com.spring.core;

import org.springframework.stereotype.Component;

@Component("bike")//IOC already create in that way the name specific id to use in @qualifier
public class Bike implements Vehicle {

    @Override
    public void move() {
        System.out.println("Bike is moving..");
    }

}
