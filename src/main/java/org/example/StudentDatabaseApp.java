package org.example;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask how many new students we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i] .enroll();
            students[i] .payTuition();

        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("**********************************************");
            System.out.println("Student "+ (i + 1) + "\n" + students[i].toString());
            System.out.println("**********************************************");
        }

    }
}
