package com.example.qualifier.component.vehicle;

import org.springframework.stereotype.Component;

@Component("bikeBean")
public class Bike implements Vehicle {

    @Override
    public String mode() {
        return "riding a bike";
    }
}
