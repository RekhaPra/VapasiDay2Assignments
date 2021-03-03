package javaassignmentsday1;

import java.util.Scanner;

public class SchoolGrade {
    public static void main(String[] args) {
        //Ask user to enter marks and print the corresponding grade
        //a. Below 25 - Fb. 25 to 45 - Ec. 45 to 50 - Dd. 50 to 60 - Ce. 60 to 80 - Bf. Above 80 - A
        int mark;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks :");
        mark = scanner.nextInt();
        if (mark > 80) {
            System.out.print("A");
        } else if (mark >= 60 && mark <= 80) {
            System.out.print("B");
        } else if (mark >= 50 && mark <= 60) {
            System.out.print("C");
        } else if (mark >= 45 && mark <= 50) {
            System.out.print("D");
        } else if (mark >= 25 && mark <= 45) {
            System.out.print("E");
        } else {
            System.out.print("F");
        }

    }
}
