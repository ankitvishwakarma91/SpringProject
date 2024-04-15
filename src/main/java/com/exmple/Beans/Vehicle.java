package com.exmple.Beans;

// Pojo class

import com.example.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {

    private String name = "Ferrari" ;
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Hello here beans are created by using component");
    }

    @Override
    public String toString(){
        return "Vehicle name is "+ name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }
}
