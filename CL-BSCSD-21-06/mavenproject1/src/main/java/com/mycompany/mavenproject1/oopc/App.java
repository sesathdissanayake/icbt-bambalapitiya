/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.oopc;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Sesath
 */
public class App {

    public static void main(String[] args) {
        //        Student student = new Student("ST0001", "John", "Smith");
        //        Employee employee = new Employee("EM0001", "Mark", "Rider");
        //        System.out.println(student.getFullName());
        //        System.out.println(employee.getFullName());

        // polymorphism
        Person student1 = new Student("ST0001", "Leonardo", "Turtle");
        Person student2 = new Student("ST0002", "Raphael", "Turtle");
        Person student3 = new Student("ST0003", "Donatello", "Turtle");
        Person student4 = new Student("ST0004", "Michelangelo", "Turtle");
        Person employee1 = new Employee("EM0001", "Mark", "Rider");

        List<Person> personCollection = Arrays.asList(student1, student2, student3, student4, employee1);

        personCollection.forEach((Person person) -> {
            System.out.println(person.getFullName());
        });

    }
}
