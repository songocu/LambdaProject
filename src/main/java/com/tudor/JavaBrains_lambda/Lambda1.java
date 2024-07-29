package com.tudor.JavaBrains_lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {
        // Create a List of Person objects
        List<Person> personList = new ArrayList<>();

        // Add some Person objects to the list
        personList.add(new Person("Alice", "Smith", 25));
        personList.add(new Person("Bob", "Johnson", 30));
        personList.add(new Person("Charlie", "Brown", 22));
        personList.add(new Person("David", "Lee", 28));
        personList.add(new Person("Emma", "Garcia", 35));

        // Sort the list of Person objects by last name
        personList.sort((p1, p2) -> p1.getAge() - p2.getAge());

        // Print the list of Person objects
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}