package com.tap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("Mallikarjun")
    private String name;

    @Value("25")
    private int age;

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}