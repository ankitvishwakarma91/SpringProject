package com.example.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration

@ComponentScan(basePackages = {"com.example.implementation","com.example.sevieces"} )
@ComponentScan(basePackageClasses = {com.exmple.Beans.Vehicle,com.exmple.Beans.Person})
public class ProjectConfig {


}
