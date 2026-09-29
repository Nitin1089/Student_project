package com.example;


public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Student s1 = new RegularStudent(
            "Nitin",
            19,
            "nitin@gmail.com",
            101,
            "BCA",
            80,
            78
        );

        Student s2 = new RegularStudent(
            "Rahul",
            20,
            "rahul@gmail.com",
            102,
            "BCA",
            75,
            68
        );

        Student s3 = new OnlineStudent(
            "Aman",
            19,
            "aman@gmail.com",
            103,
            "BCA",
            85,
            6
        );
        
        Person P1 = new Person("Nitin", 20, "kl5@gmail.com");

        System.out.println("----------Person Detail---------");
        P1.DisplayPersonDetails();

        System.out.println();



        // Display details
        System.out.println("========== STUDENT 1 ==========");
        s1.DisplayStudentDetails();
        s1.calculateEligibility();

        System.out.println();


        System.out.println("========== STUDENT 2 ==========");
        s2.DisplayStudentDetails();
        s2.calculateEligibility();

        System.out.println();


        System.out.println("========== STUDENT 3 ==========");
        s3.DisplayStudentDetails();
        s3.calculateEligibility();


        // Method Overloading
        System.out.println("\n========== METHOD OVERLOADING ==========");

        System.out.println("\nCalling addMarks(int):");
        s1.addMarks(5);

        System.out.println("\nCalling addMarks(int, int):");
        s1.addMarks(10, 15);

        System.out.println("\nCalling addMarks(int, int, int):");
        s1.addMarks(20, 15, 10);
    }
}
