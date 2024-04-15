package com.example.main;


import com.example.config.ProjectConfig;
import com.exmple.Beans.Person;
import com.exmple.Beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

//        VehicleService vs = context.getBean(VehicleService.class);

        System.out.println("Person name " + person.getName());
        System.out.println("Vehicle name " + vehicle.getName());
        System.out.println("Owner name: "+ person.getVehicle());


    }

}
