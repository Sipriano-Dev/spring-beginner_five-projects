package com.spring.core;

public class Client {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        Traveller traveller = new Traveller(vehicle);

        traveller.startJourney();

    }

}
