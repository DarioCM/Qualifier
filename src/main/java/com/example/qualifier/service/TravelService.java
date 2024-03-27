package com.example.qualifier.service;

import com.example.qualifier.component.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
* @Qualifier Helps to inject the specific beans when beans
* implement the same interface.
* */
@Service
public class TravelService {

  private Vehicle vehicle;

  @Autowired
  public TravelService(@Qualifier("carBean") Vehicle vehicle) {
      this.vehicle = vehicle;
  }

  public String travelMode() {
      return vehicle.mode();
  }



}
