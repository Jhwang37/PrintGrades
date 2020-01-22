package com.company;

import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many grades would you like to enter: ");
        int count = scan.nextInt();

        while (counter <= count) {//runs true until counter is equal to users count
            System.out.println("Enter your percentage: ");
            int grade = scan.nextInt();
            getGrade(grade);
            counter++;
        }
        System.out.println("Thanks for using");
    }

    public static int getGrade(int grade) { //if/else method for returning letter grade
        if (grade > 97) {
            System.out.println("A+");
        } else if (grade > 94) {
            System.out.println("A");
        } else if (grade > 90) {
            System.out.println("A-");
        } else if (grade > 87) {
            System.out.println("B+");
        } else if (grade > 84) {
            System.out.println("B");
        } else if (grade > 80) {
            System.out.println("B-");
        } else if (grade > 77) {
            System.out.println("C+");
        } else if (grade > 74) {
            System.out.println("C");
        } else if (grade > 70) {
            System.out.println("C-");
        } else if (grade > 60) {
            System.out.println("D");
        } else {
            System.out.println("Go back to school");
        }
        return grade;
    }
}
