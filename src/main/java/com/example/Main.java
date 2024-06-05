package com.example;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        Book book1 = new Book("Harry Potter", "Rowling", 100);
        
    
        // Use getters
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Age: " + student1.getAge());
        System.out.println("Updated Number of Copies: " + book1.getNumberOfCopies());
    
        // Use setters
        student1.setName("Alicia");
        student1.setAge(21);
        book1.setNumberOfCopies(90);
    
        // Display student details
        student1.displayDetails();
        student2.displayDetails();
        book1.displayBookDetails();
        System.out.println("Updated Number of Copies: " + book1.getNumberOfCopies());
    
        // Use static function
        //System.out.println("Total Students: " + Student.getStudentCount());

        

    }
    

    
}


