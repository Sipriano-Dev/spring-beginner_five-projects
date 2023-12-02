package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration //This is a Configuration class of IoC Container To create and manage beans
@ComponentScan(basePackages = "com.spring.core")
public class AppConfig {

//    @Bean //Tells the Spring IoC that's return an instance of a Car Class and Spring will manage
//    public Vehicle car() {
//        return new Car();
//    }
//
//    @Bean
//    public Vehicle bike(){
//        return new Bike();
//    }
//
//    @Bean
//    public Vehicle Bycicle() {
//        return new Bycicle();
//    }
//
//    @Bean
//    public Traveler traveller() {
//        return new Traveler(new Bycicle());
//
//    }


}
