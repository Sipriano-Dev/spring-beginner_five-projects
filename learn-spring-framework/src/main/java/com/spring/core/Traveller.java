package com.spring.core;

public class Traveller {

    private Vehicle vehicle = null;

    public Traveller(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney(){
        this.vehicle.move();
    }

}
