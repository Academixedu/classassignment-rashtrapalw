package com.example;

public class Student {
    // Private instance variables
    private String name;
    // Implement age
    private int age;

    // Implement count
    private static int count;

    // Constructor that initializes the name and age
    public Student(String name, int age) {
        this.name = name;
        // Initialize age
        this.age= age;
        // Increment the student count
       count++;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Implement getter for age

    public int getAge() {
        return age;
    }

     // Implement setter for age

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



   

    // Implement static function to get the student count
    public static void getStudentCount(){

    }

    // Implement object function to display student details
    public void displayDetails(){
        System.out.println("name "+name);
        System.out.println("age "+age);

    }
    
//Student.java
// variables.. name
// constructor
//gettter and setter
//read
}