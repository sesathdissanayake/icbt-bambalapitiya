/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.oopc;

/**
 *
 * @author Sesath
 */
public class Employee extends Person {

    String id;

    public Employee() {
        this.id = "";
    }

    public Employee(String id, String firtName, String lastName) {
        super(firtName, lastName);
        this.id = id;
    }

    @Override
    public String getFullName() {
        return "Employee Full Name: " + super.getFullName();
    }

}
