package com.spring.core;

import org.springframework.stereotype.Component;

@Component("bycicle") //IOC already create in that way the name specific id to use in @qualifier
public class Bycicle implements Vehicle {

    @Override
    public void move() {
        System.out.println("Bycile is moving..");

    }

}
