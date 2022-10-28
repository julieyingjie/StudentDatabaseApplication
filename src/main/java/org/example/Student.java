package org.example;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor : prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student grade level: "+
                            "\n1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    // generate an ID
    private void setStudentID(){
        id++;
        // Grade level + ID
        this.studentID = gradeYear +  "" + id;
    }

    // Enroll in courses

    // View balance

    // Pay tuition

    // Show status
}
