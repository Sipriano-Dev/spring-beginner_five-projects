package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class Client {

    public static void main(String[] args) {

        //Creating Spring IoC Container
        //Read the Configuration Class
        //Create and manage the Spring beans

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Retrieve spring beans from spring IoC container
        Car car = applicationContext.getBean(Car.class);
        car.move();
        Bike bike = applicationContext.getBean(Bike.class);
        bike.move();
        Traveler traveler1 = applicationContext.getBean(Traveler.class);
        traveler1.startJourney();

    }

}
