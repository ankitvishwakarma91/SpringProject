package com.example.main;


import com.example.config.ProjectConfig;
import com.exmple.Beans.Person;
import com.exmple.Beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();*/
        person.getVehicle().getVehicleService().playMusic();
        person.getVehicle().getVehicleService().moveVehicle();


    }

}
