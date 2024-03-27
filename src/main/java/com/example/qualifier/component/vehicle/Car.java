package com.example.qualifier.component.vehicle;

import org.springframework.stereotype.Component;

/*
* @Component is an annotation that allows Spring to detect our custom beans automatically.

In other words, without having to write any explicit code, Spring will:

Scan our application for classes annotated with @Component
Instantiate them and inject any specified dependencies into them
Inject them wherever needed
* */
@Component("carBean")
public class Car implements Vehicle {

    @Override
    public String mode(){
        return "Driving a car";
    }
}
